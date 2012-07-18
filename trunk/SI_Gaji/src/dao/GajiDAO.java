/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.tbGaji;
import interfacenya.Gajiface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * tesssss
 * @author Dhurand
 */
public class GajiDAO extends GeneralDAO implements Gajiface {
    
    public GajiDAO(EntityManager em){
        super(em);
    }

    @Override
    public String update(long id, tbGaji gj) {
       String status = "Gagal Update";
       
        try {
            em.getTransaction().begin();
            em.find(tbGaji.class, id).setTunjangan1(gj.getTunjangan1());
            em.find(tbGaji.class, id).setTunjangan2(gj.getTunjangan2());
            em.find(tbGaji.class, id).setGolongan(gj.getGolongan());
            em.find(tbGaji.class, id).setPajak(gj.getPajak());
            em.find(tbGaji.class, id).setGajiPokok(gj.getGajiPokok());
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
            em.remove(em.find(tbGaji.class, id));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return status;
    }

    
    
    @Override
    public tbGaji get(long id) {
        tbGaji gaji = null;
        
        try {
            em.getTransaction().begin();
            gaji = em.find(tbGaji.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return gaji;
    }

    @Override
    public List<tbGaji> getAll() {
        List<tbGaji> list = new ArrayList<tbGaji>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM tbGaji p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    

    
}
