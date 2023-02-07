/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import java.util.Scanner;

/**Declarar un enum que sea Amigos con las constantes: 
 * JEROEN, JAVI, FRAN, ANGEL, FELIX, LEO
 *Vamos a pedirle al usuario, mediante una funcion, que introduzca un nombre y 
 * si es uno de mis amigos, lo voy a meter en un array hasta tener 5 amigos.
 * Tambien vamos a llevar un array con la edad de mis amigos de 0 a 150.
 * Luego se mostrara por pantalla cuales de los nombres introducidos son amigos
 * mios, junto con la edad. 
 * Mejora: Sacar los amigos ordenados alfabéticamente y contamos cuantas
 * veces se repite cada uno y sacarlos de los mas jovenes a los mas viejos. 
 * 
 */

public class repasoEnums {
    enum Amigos {JEROEN, JAVI, FRAN, ANGEL, FELIX, LEO}
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Amigos[] misAmigos = new Amigos[5]; 
        int[] edadAmigos = new int[5]; 
        int contadorAmigos = 0;
        String miNombre = pedirNombre();
        Amigos miAmigo = esAmigo(miNombre);
        if (miAmigo != null){
            misAmigos[contadorAmigos] = miAmigo;
            System.out.println(miAmigo +" es mi amigo"); 
            int edadAmigo = pedirEdad();
            System.out.printf("La edad de %s es %d \n" ,miAmigo,edadAmigo);
            edadAmigos[contadorAmigos] = edadAmigo;
        } else{
            System.out.println(miNombre + " no es tu amigo/a");
        }
       
        
    }
    // La funcion solo me va a devolver el nombre introducido por el usuario. 
    public static String pedirNombre(){
        System.out.print("Introduce el nombre de tu amigo: ");
        String nombre = teclado.next();
        return nombre;
        
    }
     
    //La funcion comprueba si es uno de los valores de mi enum.
    //Si no lo es,devuelvo un null. 
    public static Amigos esAmigo(String nombrePedido){
        Amigos miAmigo = null;
        try{
            miAmigo = Amigos.valueOf(nombrePedido.toUpperCase());
        }catch (IllegalArgumentException error){
        }
        return miAmigo;   
    }
    //Esta funcion va a pedir la edad del usuario hasta que meta una que 
    //sea correcta (de 0 a 150)
    public static int pedirEdad(){
        int edad; 
        do{
            System.out.print("Introduzca la edad de tu amigo: ");
            edad = teclado.nextInt();
        }while(edad < 0 || edad > 150);
        
        return edad;
    }
}
