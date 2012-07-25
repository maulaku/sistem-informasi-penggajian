/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entity.Karyawan;
import java.util.List;

/**
 *
 * @author Adi
 */
public interface KaryawanInterface {
    
    public String Insert(Karyawan k);
    public String Update(String NIK,Karyawan k);
    public String Delete(String NIK);
    public List<Karyawan> getByNIK(String NIK);
    public List<Karyawan> getAll();
}
