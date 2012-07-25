/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;

/**
 *
 * @author Hotasta
 */
public class General {
    EntityManager em;
    public General(EntityManager em){
        this.em = em;
    }
    
}
