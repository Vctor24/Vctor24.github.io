/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpractica;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author diurno
 */
public class ExamenPractica {

    /**
     * @param args the command line arguments crear una funcion llamada
     * mediArray que me devuelva la media aritmetica de aquellos enteros impares
     * que haya dentro de un array unidimensional (de cualquier tamaño). el main
     * debe llamar a la funcion y pasarle el correspondiente array. tambien sera
     * el main el que muestre la media obtenida. (sumo los numeros y lo divido
     * entre el numero de numeros que hay)
     */
    public static void main(String[] args) {
        //MEDIARRAY
        /* 
        int c; 
        Scanner teclado = new Scanner (System.in);
         
        System.out.println("Introduzca cuantos numeros desea que contenga el array: ");
        c= teclado.nextInt();
        double[]numeros = new double[c];
        
        
        double solucion = mediArray(numeros, c);
        System.out.println("La media aritmética de los valores es "+ solucion);
         */
        //ARRAYEJEMPLO
        /*
        byte [][]miArray = arrayEjemplo();
        mostrarArrayBidi(miArray);
         */
        //RELLENAR UNA MATRIZ 6*7 DE NUMEROS ALEATORIOS ENTRE 1 Y 100
        /*int[][] numer = new int[6][7];
        mostrarArrayBidiI(aleaArrayBidi(numer));*/
        ej3();
    }

    public static double mediArray(double[] numeros, int c) {
        Scanner teclado = new Scanner(System.in);
        double n = 0, m;
        int d = 0;
        for (int i = 0; i < c; i++) {
            System.out.println("Introduzca el valor del número de la posición "
                    + "" + i + ": ");
            numeros[i] = teclado.nextInt();
            if (numeros[i] % 2 != 0) {
                n = n + numeros[i];

                d++;
            }
        }

        m = n / d;
        return (m);

    }

    public static byte[][] arrayEjemplo() {
        //matriz con elemento 8 en todas sus celdas        
        //6 filas 2 columnas. 
        byte[][] nums = new byte[6][2];
        for (int fila = 0; fila < nums.length; fila++) {
            byte[] mifila = {8, 8};
            nums[fila] = mifila;
        }
        return nums;
    }

    public static void mostrarArrayBidi(int [][] bidi) {
        for (int fila = 0; fila < bidi.length; fila++) {
            System.out.print("Fila: " + fila);
            System.out.println(Arrays.toString(bidi[fila]));
        }
    }
    public static void mostrarArrayBidiI(char [][] bidi){
        for (int fila = 0; fila < bidi.length; fila++) {
            for (int columna = 0; columna < bidi[fila].length; columna++) {
                System.out.print(bidi[fila][columna]);
            }
            System.out.println();
        }
    }
    public static int[][] aleaArrayBidi(int[][] n) {

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                int alea = ThreadLocalRandom.current().nextInt(1, 101);
                n[i][j] = alea;
            }

        }

        return n;
    }
    /*
    1.crear una matriz en que todas las columnas tengan el valor de la posicion de la fila y pedimos al usuario
    el numero de filas y columnas. ej: 01234
                                       01234
                                       01234
    2. que el numero de fila sean los valores de las columnas. ej: 0000
                                                                   1111
                                                                   2222
                                                                   3333
    3. hacer cruz 
     00x00
     00x00
     xxxxx
     00x00
     00x00
     00x00
     00x00
    4. matriz simetrica
    5. busca minas
    6. barquitos 
    */
    public static void ej3(){
        int nc = pedirColumnas();
        int f = ((nc-1)/2)+nc;
        System.out.println(f);
        char[][]cruz = new char[f][nc];
        int x1 = ((nc+1)/2)-1;
        for (int i = 0; i < cruz.length; i++) {
            cruz[i][x1]='*';
            cruz[x1][i]='*';
        }
        for (int fila = 0; fila < cruz.length; fila++) {
            for (int columna = 0; columna < cruz[fila].length; columna++) {
                System.out.print(cruz[fila][columna] + "\t");
            }
            System.out.println();
        }   
    }
    public static int pedirColumnas(){
        Scanner teclado = new Scanner(System.in);
        int c;
        do{
            System.out.print("Introduzca numero de columnas, ha de ser impar y minimo 3: ");    
            c = teclado.nextInt();
        }while (c%2 == 0 && c <3);
        return c;
                
    }
}
