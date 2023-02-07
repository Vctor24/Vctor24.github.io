/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubaduda;

/**
 *
 * @author diurno
 */
public class Coche {
    //Cuando son privados obligamos a que solo se pueda acceder a el a traves de
    //un setter. 
    private static int numRuedas = 6;
    private String color;
    //Se podria poner un static en el constructor, pero no tiene sentido hacerlo
    public Coche(String color) {
        this.color = color;
    }

    public static int getnumRuedas() {
        return numRuedas;
    }

    public static void setnumRuedas(int numRuedas) {
        Coche.numRuedas = numRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + " numRuedas: " + numRuedas +'}';
    }
}
