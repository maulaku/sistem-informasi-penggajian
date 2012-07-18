/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacenya;

import entity.tbGaji;
import java.util.List;

/**
 *
 * @author Dhurand
 */
public interface Gajiface extends Generalface {
    public String update(long id,tbGaji gj);
    public String delete(long id);
    
    public tbGaji get(long id);
    public List<tbGaji> getAll();
}
