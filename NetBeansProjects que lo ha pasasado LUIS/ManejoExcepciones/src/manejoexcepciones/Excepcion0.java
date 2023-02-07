/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

/**
 *
 * @author diurno
 */
public class Excepcion0 extends Exception{

    public Excepcion0() {
        super ("El numero introducido no puede ser 0"); //Accede al constructor del cual es herencia: Exception.
    }
    
}
