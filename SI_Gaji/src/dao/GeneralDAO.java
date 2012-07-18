/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfacenya.Generalface;
import javax.persistence.EntityManager;

/**
 *
 * @author Dhurand
 */
public class GeneralDAO implements Generalface {
    
    EntityManager em;
    
    public GeneralDAO(EntityManager em){
        this.em = em;
    }

    @Override
    public String insert(Object o) {
        String status = "Gagal Insert";
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            status = "Sukses Insert";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


}
