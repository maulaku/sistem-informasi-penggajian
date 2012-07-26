/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Karyawan;
import interfac.KaryawanInterface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Hotasta
 */
public class KaryawanDAO extends General implements KaryawanInterface {

    public KaryawanDAO(EntityManager em){
        super(em);
    }
    
    @Override
    public String Insert(Karyawan k) {
       String status = "Gagal Insert";
        try {
            em.getTransaction().begin();
            em.persist(k);
            em.getTransaction().commit();
            status = "Sukses Insert";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public String Update(String NIK, Karyawan k) {
        String status = "Gagal Update";
        try {
            List<Karyawan> list = new ArrayList<Karyawan>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Karyawan p WHERE p.NIK = '"+NIK+"'").getResultList();
            
            Karyawan x = new Karyawan();
            x.setId(list.get(0).getId());
            x.setNIK(list.get(0).getNIK());
            
            x.setNama(k.getNama());
            x.setGolongan(k.getGolongan());
            x.setGender(k.getGender());
            x.setAlamat(k.getAlamat());
            
            
            em.merge(x);
            
            
            em.getTransaction().commit();
            status = "Sukses Update";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public String Delete(String NIK) {
        String status = "Gagal Delete";
        try {
            List<Karyawan> list = new ArrayList<Karyawan>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Karyawan p WHERE p.NIK = '"+NIK+"'").getResultList();
            
            Karyawan x = new Karyawan();
            x.setId(list.get(0).getId());
            
            em.remove(em.find(Karyawan.class, x.getId()));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Karyawan> getByNIK(String NIK) {
        List<Karyawan> list = new ArrayList<Karyawan>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Karyawan p WHERE p.NIK = '"+NIK+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Karyawan> getAll() {
       List<Karyawan> list = new ArrayList<Karyawan>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Karyawan p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
