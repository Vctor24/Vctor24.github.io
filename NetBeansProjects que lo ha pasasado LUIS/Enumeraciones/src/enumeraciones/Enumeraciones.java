/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import java.util.Scanner;



public class Enumeraciones {
    
enum Level {LOW,MEDIUM,HIGH}

static Scanner teclado = new Scanner(System.in);
 

    public static void main(String[] args) {
        System.out.println("Type the gas level: ");
        Level nivelGasoil = Level.valueOf(teclado.next().toUpperCase());
        
        switch (nivelGasoil){
            case LOW: System.out.println("Search for a GasStation RIGHT NOW!!");
            break;
            case MEDIUM: System.out.println("You should think about refuelling");
            break;
            case HIGH: System.out.println("Go ahead!");
            break; 
            default: System.out.println("Unexpected gas level!!");
        }
        for (Level nivel : Level.values()) {
            System.out.println(nivel);
        }
        
        
        
    }
    
    
}
