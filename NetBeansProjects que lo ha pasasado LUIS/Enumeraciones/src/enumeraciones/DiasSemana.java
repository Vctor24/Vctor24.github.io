/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import java.util.Calendar;
import java.util.Scanner;

public class DiasSemana {
    //Creamos un tipo de datos DaysofWeek con los dias de la semana.
    /*creamos una función llamada pedirDia, que le pida el dia de la semana al usuario.
    La función devolverá el dia de la semana introducido. Si el usuario
    introduce algo erróneo veamos a buscar el día de la semana al S.O y devolvemos
    este dia.´
    */
    static Scanner teclado = new Scanner(System.in); 
    enum DaysofWeek {MONDAY,TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    public static void main(String[] args) {
    
        System.out.println("Today is "+pedirDia());
    }
    
    public static DaysofWeek pedirDia(){
        DaysofWeek day = null; 
        System.out.println("Type the day of the week: ");
        
        try{
            day = DaysofWeek.valueOf(teclado.nextLine().toUpperCase());
        } catch (IllegalArgumentException error){
            System.out.println("WRONG DAY!");
            day = checkSystemDay();
            
            
        }
        return day;
    }
    
    public static DaysofWeek checkSystemDay(){
        DaysofWeek returnDay = null;
        Calendar calendario = Calendar.getInstance();
        int dayCheck = calendario.get(Calendar.DAY_OF_WEEK);
        switch(dayCheck){
            case 1: returnDay = DaysofWeek.SUNDAY;
                    break;
            case 2: returnDay = DaysofWeek.MONDAY;
                    break;
            case 3: returnDay = DaysofWeek.TUESDAY;
                    break;
            case 4: returnDay = DaysofWeek.WEDNESDAY;
                    break;        
            case 5: returnDay = DaysofWeek.THURSDAY;
                    break;
            case 6: returnDay = DaysofWeek.FRIDAY;
                    break;
            case 7: returnDay = DaysofWeek.SATURDAY;
                    break;
        }
        return returnDay;
    }
}
 