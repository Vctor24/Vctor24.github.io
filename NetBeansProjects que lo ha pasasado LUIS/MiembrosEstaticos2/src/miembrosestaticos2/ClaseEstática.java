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
public class ClaseEstática {
    // Atributos
    
    // Estatico (ATRIBUTOS DE CLASE)
    static String atribEstatico = "Estático"; 
    // No Estático
    String nombre= "Victor";
    
    // Métodos
    public static String muestraEstaticos(){
        return "atribEstatico: " + atribEstatico;
    }
            

    public String mostrarClase() {
        return muestraEstaticos() + "\nNombre: " + nombre;
    }
    
}
