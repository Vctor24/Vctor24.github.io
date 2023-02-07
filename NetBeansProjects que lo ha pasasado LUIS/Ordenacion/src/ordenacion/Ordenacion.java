/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author diurno
 */
public class Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HECHO POR VICTOR");
        Persona2[] pupils = new Persona2[6];
        
        Persona2 javi = Persona2.makePersona("Javi", (byte) 20, "male", "85487845D");
        Persona2 fran = Persona2.makePersona("Francisco",(byte) 30, "male", "78243571D");
        Persona2 leo = Persona2.makePersona("Leo", (byte) 18, "male", "78451202k");
        Persona2 angela = Persona2.makePersona("Angela",(byte) 50, "female", "54545454l");
        Persona2 esther = Persona2.makePersona("Esther", (byte) 19, "female", "98653265D");
        Persona2 german = Persona2.makePersona("German",(byte) 21, "male", "45567889D");
        int comp = javi.compareTo(fran);
        if(javi != null && fran != null && angela != null && esther != null 
                && leo != null && german != null){
            pupils[0] = javi;
            pupils[1] = fran;
            pupils[2] = leo;
            pupils[3] = angela;
            pupils[4] = esther;
            pupils[5] = german;
            System.out.println("My pupils: ");
            showPupils(pupils);
            System.out.println("-------------(ASC ORDER)-------------");
            Arrays.sort(pupils);//ORDENAMOS ALUMNOS POR EL IDCARD DEBIDO AL COMPARETO Y AL IMPLEMENTAR EL COMPARABLE. 
            //por defecto en orden ascendente
            showPupils(pupils);
            System.out.println("-------------(DESC ORDER)-------------");
            Arrays.sort(pupils,Collections.reverseOrder());// ORDENA PERO EN SENTIDO CONTRARIO. TODO LO QUE ES MENOR LO HACE MAYOR Y VICEVERSA. 
            showPupils(pupils);
            System.out.println("--------------------------");
//        if(comp == 0){
//            System.out.printf("%s y %s son iguales", javi.getName(), fran.getName());
//        } else if (comp < 0){
//            System.out.printf("%s es menor que %s ", javi.getName(), fran.getName());
//        } else System.out.printf("%s es mayor que %s", javi.getName(), fran.getName());
    }
        System.out.print("Numbers in asc order: ");  
        int[] numbers = {7,-3,5,4,6};
        Arrays.sort(numbers, 1, 5);//ordena del intervalo de 1 al de 5 que es el 4, ya que empieza con 0. 
        System.out.println(Arrays.toString(numbers));
        System.out.println("");
        System.out.print("Numbers in desc order: ");
        Integer[] numbersInteger = {-7,-3,5,4,6,9};
        //El reverseOrder solo funciona con variables wrapper es decir, Integer, Double, etc.
        Arrays.sort(numbersInteger,1,5,Collections.reverseOrder());// ordena de forma descendente los valores de dentro del intervalo introducido. 
        System.out.println(Arrays.toString(numbersInteger));    
        //Ahora ordenamos, usando comparator, por idCard.
        PersonaOrdenadaPorIdCard comp1 = new PersonaOrdenadaPorIdCard();
        Arrays.sort(pupils,Collections.reverseOrder(comp1));
        showPupils(pupils);
        //Ahora ordenamos, usando comparable(clase Persona), por Nombre.
        Arrays.sort(pupils);
        showPupils(pupils);
        //Ahora usamos la clase PersonaOrdenadaPorEdad para ordenar por edad valga la redundancia.
        Arrays.sort(pupils, new PersonaOrdenadaPorEdad());
        showPupils(pupils);
    }
    
    
    public static void showPupils(Persona2[] people){
        for (Persona2 persona : people) {
            System.out.print(persona.showNameId()+ " Age: " + persona.getAge() + " , ");
            
        }
        System.out.println("");
    }
}
