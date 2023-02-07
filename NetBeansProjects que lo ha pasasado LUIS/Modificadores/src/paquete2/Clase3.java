/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete.Clase;

/**
 *
 * @author diurno
 */
public class Clase3 {
    int prueba3; 

    public Clase3(int prueba) {
        prueba3 = prueba;
    
    }

    public int getPrueba() {
        return prueba3;
    }

    public void setPrueba(int prueba) {
        prueba3 = prueba;
    }
    public void accesoAClase(){
    Clase claseNueva = new Clase();
    claseNueva.nombre = "Clase nueva dentro de Clase 3";
    System.out.println(claseNueva.nombre);
    }
    @Override
    public String toString() {
        return "Clase2{" + "prueba=" + prueba3 + '}';
    }
    
}
