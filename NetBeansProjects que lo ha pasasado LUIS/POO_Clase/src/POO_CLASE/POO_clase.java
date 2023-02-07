/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_CLASE;

import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class POO_clase {
    public static void main(String[] args) {
//        coche cocheVictor = new coche();
//        cocheVictor.inicializarCoche("Seat", "Blanco", "4520abc", "Leon");
        //llamamos a un constructor, ahorrando pasos
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca marca: ");
        String marca = teclado.nextLine();
        System.out.print("Introduzca color: ");
        String color = teclado.nextLine();
        System.out.print("Introduzca el tipo de combustible: ");
        String combustible = teclado.next();
        coche cocheVictor = new coche(marca, color, combustible);
        cocheVictor.setVelocidad(200);
        
//        System.out.println(cocheVictor.getMarca() + " " + cocheVictor.getColor()
//                + " y va a " + cocheVictor.getVelocidad() + " Km/h");
        
        System.out.println(cocheVictor.toString());
    }
}
