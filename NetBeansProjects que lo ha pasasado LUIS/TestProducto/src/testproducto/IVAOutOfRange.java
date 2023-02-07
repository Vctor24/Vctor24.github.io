/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproducto;

/**
 *
 * @author diurno
 */
public class IVAOutOfRange extends Exception{

    public IVAOutOfRange() {
        super("El valor seleccionado esta fuera del rango del IVA"); 
    }
    
}
