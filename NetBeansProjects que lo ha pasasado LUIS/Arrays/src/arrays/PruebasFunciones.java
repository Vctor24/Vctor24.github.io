/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasfunciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diurno
 */
public class PruebasFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera multiplicacion
//        double re = mult3Double(4.5,5.6,6.7);
//        System.out.println("La multiplicacion es= "+re);
        //Segunda multiplicacion
        //System.out.println("La multiplicacion es: "+ mult3Double2());
        //Tercera multiplicacion
//         Scanner teclado = new Scanner(System.in);
//         System.out.println("Introduzca el numero de veces que quiere multiplicar: ");
//         byte x = teclado.nextByte();
//         
//         System.out.println("El resultado es "+ multDouble(x));

        //Arrays 1
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce cuantos nº tiene el array: ");
//        int c = teclado.nextInt();
//       
//        multiArrays(c);
        //Arrays 2
        //Crear una funcion que muestre por pantalla INDICE: DATO de un array creado en el main.
//        double[] tabla = {5.3,6,5,8,9};
//        
//        indiceArrays(tabla);
        //Arrays3
//        System.out.println("Has introducido el numero " + pidePositivo());
        //
        //Multiplos
//        int n;      
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Introduzca: ");
//        n = teclado.nextInt();
//        
//        if (esMultiplo3(n)==0){
//            System.out.println("Es multiplo de 3");
//        } else{
//            System.out.println("No es mulplo de 3");
//        }
    }

    public static void sumas() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int n = teclado.nextInt();
        System.out.print("introduce otro numero: ");
        int m = teclado.nextInt();
        int suma = suma2Enteros(n, m);
        System.out.println(suma);
    }

    public static int suma2Enteros(int n1, int n2) {
        int s = n1 + n2;
        return s;
    }

    public static double mult3Double(double d1, double d2, double d3) {
        return (d1 * d2 * d3);
    }

    public static double mult3Double2() {

        double d1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un real"));
        double d2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un real"));
        double d3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un real"));

        return (d1 * d2 * d3);
    }

    public static double multDouble(byte x) {
        Scanner teclado = new Scanner(System.in);
        double y = 1;
        while (x > 0) {
            System.out.println("Introduzca numero: ");
            double z = teclado.nextDouble();
            y = z * y;
            x--;
        }
        return (y);
    }

    public static double multiArrays(int c) {
        Scanner teclado = new Scanner(System.in);
        double m = 1;
        double[] numeros = new double[c];
        for (int i = 0; i < c; i++) {

            System.out.print("numero[" + i + "]= ");
            numeros[i] = teclado.nextDouble();
            m = m * numeros[i];

        }
        System.out.println("El resultado de multiplicar todos los valores es= " + m);
        return (0);
    }

    public static void indiceArrays(double[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(i + ": " + tabla[i]);
        }
    }

    public static int pidePositivo() {
        Scanner teclado = new Scanner(System.in);
        int y;
        System.out.println("Introduzca número: ");
        y = teclado.nextInt();
        while (y < 0) {
            System.out.println("Introduzca número: ");
            y = teclado.nextInt();
        }
        return (y);
    }

    public static int esMultiplo3(int n) {
        int s = n % 3;
        return (s);
    }

    //crear una funcion llamada mediaArray, pedir tamaño del array en el main, 
    //y que me devuelva la media aritmetica de un array de doubles y mostrar.
    
    public static double mediaArray(){
        
    }
}
