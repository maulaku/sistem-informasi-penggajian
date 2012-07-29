/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Gaji;
import interfac.GajiInterface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Hotasta
 */
public class GajiDAO extends General implements GajiInterface{
    public GajiDAO(EntityManager em){
        super(em);
    }
    
    @Override
    public String Insert(Gaji g) {
        String status = "Gagal Insert";
        try {
            em.getTransaction().begin();
            em.persist(g);
            em.getTransaction().commit();
            status = "Sukses Insert";
        } catch (Exception e) {
            e.getMessage();
        }
        return status;
    }

    @Override
    public String Update(String kode, Gaji g) {
        String status = "Gagal Update";
        try {
            List<Gaji> list = new ArrayList<Gaji>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Gaji p WHERE p.kode = '"+kode+"'").getResultList();
            
            Gaji x = new Gaji();
            x.setId(list.get(0).getId());
            //x.setNIK(list.get(0).getNIK());
            x.setKode(list.get(0).getKode());
            
            x.setBulan(g.getBulan());
            x.setNama(g.getNama());
            x.setGolongan(g.getGolongan());
            x.setGajipokok(g.getGajipokok());
            x.setTunjangan1(g.getTunjangan1());
            x.setTunjangan2(g.getTunjangan2());
            x.setBonus(g.getBonus());
            x.setPajak(g.getPajak());
            x.setGajibersih(g.getGajibersih());
            
            
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
            List<Gaji> list = new ArrayList<Gaji>();
            em.getTransaction().begin();
            
            list = em.createQuery("SELECT p FROM Gaji p WHERE p.kode = '"+kode+"'").getResultList();
            
            Gaji x = new Gaji();
            x.setId(list.get(0).getId());
            
            em.remove(em.find(Gaji.class, x.getId()));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Gaji> getByKode(String kode) {
        List<Gaji> list = new ArrayList<Gaji>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p WHERE p.kode = '"+kode+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Gaji> getAll() {
        List<Gaji> list = new ArrayList<Gaji>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    @Override
    public List<Gaji> getByBulan(String bulan) {
        List<Gaji> list = new ArrayList<Gaji>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p WHERE p.bulan = '"+bulan+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Gaji> getByGolongan(String golongan) {
        List<Gaji> list = new ArrayList<Gaji>();
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p WHERE p.golongan = '"+golongan+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Gaji> getByGajiBersihASC() {
        List<Gaji> list = new ArrayList<Gaji>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p ORDER BY p.gajibersih ASC").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    @Override
    public List<Gaji> getByGajiBersihDESC() {
        List<Gaji> list = new ArrayList<Gaji>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM Gaji p ORDER BY p.gajibersih DESC").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
