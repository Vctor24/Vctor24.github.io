/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciaspracticas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class ReferenciasPracticas {

   
    public static void main(String[] args) {
        /*
        int valor1 = 9;
        int valor2 = 0;
        intercambio(valor1, valor2);
        */
        //Usamos clases envolventes (wrapper)
//        Integer v3 = 98;
//        System.out.println("v3: "+v3);
//        aumento(v3);
//        System.out.println("v3: "+v3);
//      USAMOS ARRAYS (SI CAMBIAN EN EL MAIN)
/*
        int[] edades = {14,15,16,13};
        System.out.print(edades+ " --> ");
        System.out.println(Arrays.toString(edades));
        aumentaArray(edades);
        System.out.print(edades+ " --> " + Arrays.toString(edades));
*/
       /* System.out.println("Variables de tipo primitivo");
        int valor3 = 0;
        System.out.println("valor3: "+valor3);
        aumento(valor3);
        System.out.println("valor3 despues funcion aumento: "+valor3);
        System.out.println("Observación: no cambia en el main, solo en la "
                + "función");*/
       //ej cineMAx
       Scanner teclado = new Scanner(System.in);
        int[]np = new int[7];
        for (int i = 0; i < 8; i++) {
             System.out.println("Ingrese cuantas personas asistieron a la sala "
                     + ""+i+": ");
             np[i] = teclado.nextInt();
        }
        
    }
    //Función que suma 1 a todos los elementos del array.
    public static void aumentaArray(int[]num){
        System.out.println("******FUNCION AUMENTADA*******");
        for (int i = 0; i < num.length; i++) {
           num[i]++; 
        }
        
    }
    
    
    //Función intercambio: intercambiar el valor de dos enteros. 
    public static void intercambio(int n1, int n2){
        System.out.println("n1 y n2: " + n1 + n2);
        int aux = n1;
        n1 = n2;
        n2 = aux; 
        System.out.println("n1 y n2: " + n1 + n2);
    }
    
    public static void aumento(int n3){
        n3++;
        System.out.println("n3: "+n3);
       
    }
    //ejercicio de ordenacion...cineMax
    public static void cineMax(int[]npers){
        
    }
}
