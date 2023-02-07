/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopracticaexamen;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioPracticaExamen {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        boolean esDni;
        boolean LetraCorrecta; 
        String dni;
        do{
        System.out.print("Introduzca el DNI: ");
        dni = teclado.next();
        dniClase esCorrecto = new dniClase (dni);
        esDni = esCorrecto.getnumerodni();
        LetraCorrecta = esCorrecto.getLetraDni();
        } while(!esDni || !LetraCorrecta);
    }
    
}
