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
public class ExcepcionNegativos extends Exception{
 // Para usar el super debemos de crear el constructor
    public ExcepcionNegativos() {
        super ("No se pueden introducir numeros negativos");
    }
    
}
