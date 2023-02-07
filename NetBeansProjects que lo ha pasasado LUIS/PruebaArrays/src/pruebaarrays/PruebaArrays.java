/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class PruebaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        recorreArrays();
        arraysString();
    }

    public static void recorreArrays() {
        //Definimos un array llamado numeros de 4 elementos. 

        //Definimos arrays directamente.
        int[] numer = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(numer));

        //intento ver lo que tiene numeros
//        for (byte n = 0; n < 4; n++){
//            System.out.println(numeros[n]);
//        }
        //recorro el array con un foreach
//        for (int miNum : numeros) {
//            System.out.println(miNum);
//        }
        //
    }

    public static void trabajoArrays() {
        System.out.println("---------TRABAJO ARRAYS--------");
        //Array de 6 elementos tipo cadena llamado cadenas
        String[] cadenas = new String[6];
        cadenas[4] = "Luis";
        cadenas[2] = "     ";
        cadenas[1] = "Ángel";

        for (String miCad : cadenas) {
            System.out.println(miCad);
        }
        System.out.println(Arrays.toString(cadenas));
    }

    public static void ej1Arrays() {
        int[] numeros = {-3, 2, 5, 8, -4, 6, 9, 10, -58, 16};
        int po = 0;
        while (po < 10) {
            System.out.println("El índice " + po + " tiene asociado un " + numeros[po]);
            po = po + 2;
        }
        System.out.println(Arrays.toString(numeros));
    }

    public static void ej2Arrays() {
        //Recorrer el array anterior y mostrar los números negativos.
        int[] numeros = {-3, 2, 5, 8, -4, 6, 9, 10, -58, 16};
        int pos = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println(numero);
            }

        }

    }

    public static void ej3Arrays() {
        //Recorrer el array anterior y mostramos la suma de aquellos números 
        //que sean negativos y cuyo indice sea impar. 
        int[] numeros = {-3, 2, 5, -8, -4, -6, 9, -10, -58, 16};
        int pos = 0;
        while (pos < 10) {
            if (numeros[pos] < 0 && pos % 2 != 0) {
                System.out.println(numeros[pos]);
            }
            pos++;
        }
        
    }

    public static void arraysString(){
        //array con nombres introducidos por el usuario. 
        String[] nombres = new String[5];
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<nombres.length; i++) {
            System.out.print("Introduce: ");
            String n = teclado.next();
            nombres[i]= n;
   
            
        }
        Arrays.sort (nombres);
        System.out.println(Arrays.toString (nombres));
        
    }
   
}
