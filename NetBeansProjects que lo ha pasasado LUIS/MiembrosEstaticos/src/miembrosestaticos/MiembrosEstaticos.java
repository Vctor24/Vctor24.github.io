/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miembrosestaticos;

import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class MiembrosEstaticos {

    /**
     * @param args the command line arguments
     */
    Scanner teclado = new Scanner (System.in);
    public static void main(String[] args) {
        //1º Caracteristica: Los atributos estaticos tienen el mismo valor para toda la clase
//        Coche cAngel = new Coche("azul");
//        
//        System.out.println(cAngel);
//        Coche cLeo = new Coche("rojo");
//        
//        System.out.println(cLeo);
//        
//        // Aparca en el poligamo
//        cAngel.setnumRuedas(2);
//        System.out.println(cAngel);
//        System.out.println(cLeo);
        //Una vez que le cambiamos el valor a uno, se cambia en todos.
        //2ª Caracteristica: Con los atributos estaticos no hace falta crear objetos para llamarlos
        //Pero en este caso no podemos porque numRuedas es privado.
        //Por lo que para llamarlo usaremos el nombre de la clase, punto, setnumRuedas.
        Coche.setnumRuedas(9);
        //Si fuera publico podríamos establecer su valor directamente, sin setters.
        //Coche.numRuedas = 9; 
        // 3ª Caracteristica: Todo aquello que sea usado en un método estático
        // me obliga a que sea también estático.
        // Por ejemplo con el Scanner fuera del main. 
        //En este ejemplo vemos que podemos llamar a la funcion leeEntero sin que sea estatica
        //pero tenemos que crear un objeto. 
//        MiembrosEstaticos ne = new MiembrosEstaticos();
//        ne.leeEntero();
        //Cuando tenemos dos clases de distintos paquetes que se llaman igual,
        //las diferenciamos poniendo el nombre del paquete primero. 
//        prubaduda.Coche otro = new prubaduda.Coche("azul");

    }
//    public void leeEntero(){
//        int num = teclado.nextInt();
//        System.out.println(num);
//    }
}
