/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import paquete2.Clase3;

/**
 *
 * @author diurno
 */
public class PruebaClase {
    private static String frase = "primera frase";
    public static void main(String[] args) {
//        Clase dam1 = new Clase();
//        System.out.println(dam1);
//        //Prueba de acceso
//        //Esto no debe hacerse asi, es con el setter.
//        dam1.nombre =  "Clase dam";
//        System.out.println("El nombre es: "+ dam1.nombre);
        
        Clase2 obj = new Clase2();
        obj.accesoAClase();
        Clase3 nClase = new Clase3(8);
        nClase.accesoAClase();
    }
}
