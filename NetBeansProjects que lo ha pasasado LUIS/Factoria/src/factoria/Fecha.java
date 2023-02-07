/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoria;

/**
 *
 * @author diurno
 */
public class Fecha {

    //Atributos
    private int dia, mes, año;
    private boolean leapYear;
    //Métodos
    //Constructor
    private Fecha(int dia, int mes, int año) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;
        leapYear = esBisiesto(año);
    }

    @Override 
    public String toString() {
        if(leapYear){
            return "Fecha: " + dia + " - " + mes + " - " + año + ". Es bisiesto";
        } else{
            return "Fecha: " + dia + " - " + mes + " - " + año + ". No es bisiesto";
        }
        
    }

    //Factoria, se usa siempre que necesito saber si los valores son correctos de algo. 
    public static Fecha dameFecha(int dia, int mes, int año) {
        //Lo siguiente es la estructura para comprobar que algo es correcto usando la factoria.
        if (fechaCorrecta(dia, mes, año)) {
//            if (mes == 2){
//                if (esBisiesto(año)){
//                    if (dia == Febrero(true)){
//                    dia = 1;
//                    mes = 3;
//                    } else {
//                        dia++;
//                    }
//                } else {
//                     if (dia == Febrero(false)){
//                        dia = 1;
//                        mes = 3;
//                    } else {
//                        dia++;
//                    }
//                }
//                
//                
//            } else if(dia == Treinta(mes) && mes != 12){
//                    dia = 1;
//                    mes++;
//            } else if (dia == Treinta(mes) && mes == 12){
//                dia = 1;
//                mes = 1;
//                año++;
//            } else{
//                dia++;
//            }
                
            
            return new Fecha(dia, mes, año);
        } else {
            return null;
        }
    }

    private static boolean fechaCorrecta(int dia, int mes, int año) {
        boolean result = false;
        if (esBisiesto(año)) {
            System.out.println("Es Bisiesto");
            if (mes <= 12 && mes > 0 && año > 0) {
                if (mes == 2) {
                    if (dia <= Febrero(true) && dia > 0) {
                        result = true;
                    }
                } else {
                    if (dia <= Treinta(mes) && dia > 0) {
                        result = true;
                    }
                }
            }
        } else {
            System.out.println("No es Bisiesto");
            if (mes <= 12 && mes > 0 && año > 0) {
                if (mes == 2) {
                    if (dia <= Febrero(false) && dia > 0) {
                        result = true;
                    }
                } else {
                    if (dia <= Treinta(mes) && dia > 0) {
                        result = true;
                    }
                }
            }

        }

        return result;
    }

    private static boolean esBisiesto(int año) {
        boolean resultado = true;
        if (año % 4 != 0) {
            resultado = false;
        }
        if (año % 4 == 0 && año % 100 == 0 && año % 400 != 0) {
            resultado = false;
        }
        return resultado;
    }

    private static int Febrero(boolean bisi) {
        int max = 28;
        if (bisi) {
            max = 29;
        }
        return max;
    }

    private static int Treinta(int mes) {
        int max = 31;
        if (mes < 8) {
            if (mes % 2 == 0) {
                max = 30;
            }
        } else {
            if (mes % 2 != 0) {
                max = 30;
            }
        }

        return max;
    }
    public void setDay (int dia) throws ExcepcionDia{
        if (fechaCorrecta(dia, this.mes, this.año)) this.dia = dia;
        //Con el setter modificamos los valores que ya hemos establecido con 
        //anterioridad mediante la fabrica. 
        else throw new ExcepcionDia();
    }

    public int getDay() {
        return dia;
    }

    public int getMonth() {
        return mes;
    }

    public void setMonth(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return año;
    }

    public void setYear(int año) {
        this.año = año;
    }

    public boolean isLeapYear() {
        return leapYear;
    }
}
