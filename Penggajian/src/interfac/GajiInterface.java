/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entity.Gaji;
import java.util.List;

/**
 *
 * @author Dhurand
 */
public interface GajiInterface {
    
    public String Insert(Gaji g);
    public String Update(String kode,Gaji g);
    public String Delete(String kode);
    public List<Gaji> getByKode(String kode);
    public List<Gaji> getAll();
}
