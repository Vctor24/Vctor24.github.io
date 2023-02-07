/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Comparator;

/**
 *
 * @author diurno
 */
public class OrdenaTrees implements Comparator<Trees> {

    @Override
    public int compare(Trees t, Trees t1) {
        return t.name.compareToIgnoreCase(t1.name)
    }

    
    
}
