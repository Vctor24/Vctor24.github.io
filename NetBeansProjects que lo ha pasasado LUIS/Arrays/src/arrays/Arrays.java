/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author diurno
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        recorreArrays();
        trabajoArrays();
    }
    public static void recorreArrays(){
        //Definimos un array llamado numeros de 4 elementos. 
        int[] numeros = new int[4];
        
        numeros[0] = 9;
        numeros[3] = 232;
        
        //intento ver lo que tiene numeros
//        for (byte n = 0; n < 4; n++){
//            System.out.println(numeros[n]);
//        }

        //recorro el array con un foreach
        for (int miNum : numeros) {
            System.out.println(miNum);
        }
        
        
        
        
        
    }
    public static void trabajoArrays(){
        System.out.println("---------TRABAJO ARRAYS--------");
        //Array de 6 elementos tipo cadena llamado cadenas
        String[] cadenas = new String[6];
        cadenas[4] = "Luis";
        cadenas[2] = "         ";
        cadenas[1] = "Ángel";

        for (String miCad : cadenas) {
            System.out.println(miCad);
        }
        
    }
}
