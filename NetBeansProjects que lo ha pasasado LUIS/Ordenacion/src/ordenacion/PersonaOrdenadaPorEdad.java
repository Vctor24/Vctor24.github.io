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
public class PersonaOrdenadaPorEdad implements Comparator<Persona2>{

    @Override
    public int compare(Persona2 t, Persona2 t1) {
       // return Byte.compare(t.getAge(), t1.getAge());//1ªOpcion
       //Opcion 2:
       if(t.getAge() == t1.getAge()) return 0;
       else if (t.getAge() < t1.getAge()) return -1;
       else return 1;
    }
    
}
