/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechaconexcepciones;

/**
 *
 * @author diurno
 */
public class Factoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha comp = Fecha.dameFecha(31, 12, 1630);
        System.out.println(comp);
        // falta que sea sumar dias que queramos y luego restar. 
        
    }

}
