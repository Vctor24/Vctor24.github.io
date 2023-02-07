/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionobjetosstring;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author diurno
 */
public class EjercicioString {

 
Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Tdos los ejs se haran mediante funciones
        /*
        1. Pedimos una cadena al usuario y mostraremos esa cadena subdividida
        en subcadenas de longitud 3.
        2. Invertir la cadena original introducida por el usuario y mostrar 
        la invertida.
        3. Mostrar el numero de 'a','e','i','o','u' y el numero de consonantes.
        4. codificar el algoritmo de incriptacion cesar.(3 posiciones más)
        5. Criptografia ruth. 9
        Vamos a generar un string de tamaño aleatorio (entre 1 y 50 como max)
        
        este string va a estar formado por dígitos numéricos solamente, también 
        generados al azar. 
        Una vez generado el string tenemos que buscar el digito que mas se repite 
        y subdividimos el string por el numero que hemos encontrado. 
        Luego, cogemos esas subcadenas de dos en dos y mostramos su código ASCII
        Ejemplo: '8945456654145'--> Mayor numero de repeticiones es 5
        '894' '4' '66' '414' --> Quitamos el 5. --> cojo de 2 en 2 
        --> 89 40 40 66 41 40 
        --> Y   (  ( B   )  (
        USAMOS char @ = 41; si hacemos un println sale el valor de 41 en ASCII
        */
        //5. 
        ej5();
    }
    public static void ej5(){
        int i;
        i = ThreadLocalRandom.current().nextInt(1, 51);
        String [] numeros = new String [i];
        for (int j = 0; j<numeros.length; j++) {
            int x = ThreadLocalRandom.current().nextInt(0,10);
            String z = String.valueOf(x);
            numeros[j] = z;
           
        }
//        String total = ""; 
//        for (String numero : numeros) {
//            total += numero; 
//        }
//        System.out.println(total);
          String frase = String.join("", numeros);
          System.out.println(frase);
          
    }
    public static String ej5p2(String frase){
        int[]nums = new int[10];
        for (int i = 0; i < frase.length(); i++) {
            String numero = Character.toString(frase.charAt(i));
            int indice = Integer.parseInt(numero);
            nums[indice]++;
        }
        System.out.println(Arrays.toString(nums));
        int max = 0, index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                
            }
        }
        return null;
    }
}
