/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class FECHA {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual: "+ fecha);
        
        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual: " + hora);
        
        LocalDateTime fechaYhora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: "+ fechaYhora);
        
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern(""
                + "E dd-MM-yyyy HH:mm:ss");
        String text = fechaYhora.format(fechaFormateada);
        System.out.println("Fecha formateada: "+ text);
        //Obtengo el dia de la semana en formato enum (DayOfWeek)
        //Obtengo las funciones de la documentación de las API de java 8
        DayOfWeek diaSemana = fechaYhora.getDayOfWeek();
        System.out.println(diaSemana); //como aparece en mayuscula, vemos que es un enum. 
        //Dia del año
//       
        //Resta de años -> https://docs.oracle.com/javase/8/docs/api/index.html?help-doc.html
        Year año = Year.now();
        int añoActual = año.getValue();
        System.out.println("Año de Nacimiento: ");
        int anyoNacimiento = teclado.nextInt();
        int edad = añoActual-anyoNacimiento;
        System.out.println("Tienes "+edad+" años.");
    }
    
}
