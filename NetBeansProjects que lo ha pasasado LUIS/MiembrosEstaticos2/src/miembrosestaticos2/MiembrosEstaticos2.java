/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembrosestaticos2;

/**
 *
 * @author diurno
 */
public class MiembrosEstaticos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseEstática obj1 = new ClaseEstática();
        ClaseEstática.atribEstatico = "Mi atrib estatico";
        System.out.println(obj1.mostrarClase());
        ClaseEstática obj2 = new ClaseEstática();
        obj2.nombre = "Luis";
        obj2.atribEstatico = "Adios Navidad";
        System.out.println(obj1.mostrarClase());
        System.out.println(obj2.mostrarClase());
    }
    
}
