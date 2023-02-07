/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author diurno
 */
public class Clase2 {
    int prueba2; 
   
    public Clase2(int prueba) {
        prueba2 = prueba;
    }
    public Clase2(){
        prueba2 = -1;
    }

    public int getPrueba() {
        return prueba2;
    }

    public void setPrueba(int prueba) {
        prueba2 = prueba;
        
    }
    public void accesoAClase(){
        Clase claseNueva = new Clase();
        claseNueva.nombre = "Clase nueva dentro de Clase 2";
        System.out.println(claseNueva.nombre);
    }
    @Override
    public String toString() {
        return "Clase2{" + "prueba=" + prueba2 + '}';
    }
    
}
