/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacenya;

import entity.tbKaryawan;
import java.util.List;

/**
 *
 * @author Hotasta
 */
public interface Karyawanface extends Generalface {
    public String update(long id, tbKaryawan k);
    public String delete(long  id);
    
    public tbKaryawan get (long id);
    public List<tbKaryawan> getAll();
}