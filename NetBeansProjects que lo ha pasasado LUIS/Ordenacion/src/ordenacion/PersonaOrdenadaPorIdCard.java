/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Comparator;

/**
 *
 * @author diurno
 */
public class PersonaOrdenadaPorIdCard implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Persona2 p1 = (Persona2) t;
        Persona2 p2 = (Persona2) t1;
        String numDni1 = p1.getIdCard().substring(0, 8);
        String numDni2 = p2.getIdCard().substring(0, 8);
        return numDni1.compareToIgnoreCase(numDni2);
    }
    
}
