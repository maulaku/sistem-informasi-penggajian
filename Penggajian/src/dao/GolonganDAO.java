/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Golongan;
import interfac.GolonganInterface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Hotasta
 */
public class GolonganDAO extends General implements GolonganInterface{
    
    public GolonganDAO(EntityManager em){
        super(em);
    }

    @Override
    public String Insert(Golongan g) {
        String status = "Gagal Insert";
        try {
            em.getTransaction().begin();
            em.persist(g);
            em.getTransaction().commit();
            status = "Sukses Insert";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public String Update(String kode, Golongan g) {
        String status = "Gagal Update";
        try {
            List<Golongan> list = new ArrayList<Golongan>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Golongan p WHERE p.kodeGolongan = '"+kode+"'").getResultList();
            
            Golongan x = new Golongan();
            x.setId(list.get(0).getId());
            x.setKodeGolongan(list.get(0).getKodeGolongan());
            
            x.setNamaGolongan(g.getNamaGolongan());
            x.setGajiPokok(g.getGajiPokok());
            x.setPajak(g.getPajak());
            
            em.merge(x);
            
            
            em.getTransaction().commit();
            status = "Sukses Update";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public String Delete(String kode) {
        String status = "Gagal Delete";
        try {
            List<Golongan> list = new ArrayList<Golongan>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Golongan p WHERE p.kodeGolongan = '"+kode+"'").getResultList();
            
            Golongan x = new Golongan();
            x.setId(list.get(0).getId());
            
            em.remove(em.find(Golongan.class, x.getId()));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Golongan> getByKode(String kode) {
        List<Golongan> list = new ArrayList<Golongan>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Golongan p WHERE p.kodeGolongan = '"+kode+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Golongan> getAll() {
        List<Golongan> list = new ArrayList<Golongan>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Golongan p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
