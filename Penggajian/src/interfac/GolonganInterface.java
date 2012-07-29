/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entity.Golongan;
import java.util.List;

/**
 *
 * @author Adi
 */
public interface GolonganInterface {
    
    public String Insert(Golongan g);
    public String Update(String kode,Golongan g);
    public String Delete(String kode);
    public List<Golongan> getByKode(String kode);
    public List<Golongan> getAll();
    
    public List<Golongan> getGajiPokokASC();
    public List<Golongan> getGajiPokokDESC();
    public List<Golongan> getNamaGolonganASC();
    public List<Golongan> getNamaGolonganDESC();
}
