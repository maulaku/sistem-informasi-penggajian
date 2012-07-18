/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacenya;

import entity.tbGolongan;
import java.util.List;

/**
 *
 * @author Dhurand
 */
public interface Golonganface extends Generalface {
    public String update(long id,tbGolongan g);
    public String delete(long id);
    public tbGolongan get(long id);
    public List<tbGolongan> getAll();
    public List<tbGolongan> searchByGolongan(String golongan);
    
}
