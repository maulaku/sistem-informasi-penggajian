/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.tbKaryawan;
import interfacenya.Karyawanface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Dhurand
 */
public class KaryawanDAO extends GeneralDAO implements Karyawanface {

    public KaryawanDAO(EntityManager em){
        super(em);
    }
    
    @Override
    public String update(long id, tbKaryawan k) {
        String status = "Gagal Update";
        try {
            em.getTransaction().begin();
            em.find(tbKaryawan.class, id).setNama(k.getNama());
            em.find(tbKaryawan.class, id).setGolongan(k.getGolongan());
            em.getTransaction().commit();
            status = "Sukses Update";
        } catch (Exception e) {
            e.printStackTrace();
        }
           
        return status;
    }

    @Override
    public String delete(long id) {
        String status = "Gagal Delete";
        try {
            em.getTransaction().begin();
            em.remove(em.find(tbKaryawan.class, id));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public tbKaryawan get(long id) {
        tbKaryawan k = null;
        try {
            em.getTransaction().begin();
            k = em.find(tbKaryawan.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    @Override
    public List<tbKaryawan> getAll() {
        List<tbKaryawan> list = new ArrayList<tbKaryawan>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM tbKaryawan p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
