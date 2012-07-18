/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.tbGolongan;
import interfacenya.Golonganface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Dhurand
 */
public class GolonganDAO extends GeneralDAO implements Golonganface {

    public GolonganDAO(EntityManager em){
        super(em);
    }

    @Override
    public String update(long id,tbGolongan g) {
       String status = "Gagal Update";
       
        try {
            em.getTransaction().begin();
            em.find(tbGolongan.class, id).setGajiPokok(g.getGajiPokok());
            em.find(tbGolongan.class, id).setPajak(g.getPajak());
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
            em.remove(em.find(tbGolongan.class, id));
            em.getTransaction().commit();
            status = "Sukses Delete";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    @Override
    public tbGolongan get(long id) {
        tbGolongan gol = null;
        
        try {
            em.getTransaction().begin();
            gol = em.find(tbGolongan.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return gol;
    }

    @Override
    public List<tbGolongan> getAll() {
        List<tbGolongan> list = new ArrayList<tbGolongan>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM tbGolongan p").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    @Override
    public List<tbGolongan> searchByGolongan(String golongan){
        List<tbGolongan> list = new ArrayList<tbGolongan>();
        
        try {
            em.getTransaction().begin();
            list = em.createQuery("SELECT p FROM tbGolongan p WHERE p.golongan = '"+golongan+"'").getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
