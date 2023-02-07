/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionobjetosstring;

import java.util.Arrays;

/**
 *
 * @author diurno
 */
public class TeoriaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Viva España, viva el rey, viva el orden y la ley.";
        // Metodos String
        int longitud = cadena.length();
        System.out.println("La cadena tiene longitud " + longitud);
        if (cadena.startsWith("Vi") && cadena.endsWith("ley.")) {
            System.out.println("La cadena es de " + longitud + " caracteres,"
                    + " empieza por 'Vi' y termina por 'ley.'");
        }
        //Sacamos la primera posicion donde haya una a
        int pos = cadena.indexOf('a');
        int ultpos = cadena.lastIndexOf('a');
        System.out.println("La primera ocurrencia de a está en la posición "
                + "" + pos + " y la última está en la " + ultpos);
        // Usamos indexOf (letra, posicion) para sacar todas las posiciones donde haya una a
        int posicion = cadena.indexOf('a');
        System.out.println("");
        int i = 1;
        while (posicion != -1) {
            System.out.println("La " + i + " 'a' esta en la posicion " + posicion);
            i++;
            posicion = cadena.indexOf('a', posicion + 1);
        }
        //Saber el caracter que hay en una posicion
        char carac = cadena.charAt(0);
        System.out.println("El caracter de la posicio 0 es "+carac);
        //Comparacion de cadenas con equals
        String str1="El lenguaje Java";
        String str2= new String("El lenguaje Java");//se usa new String para que
        //se guarde en otro lugar distinto al de str1. 
        if(str1==str2){
            System.out.println("Son los mismos objetos");
        } else{
            System.out.println("Son distintos objetos");
        }
        if(str1.equals(str2)){
            System.out.println("Tienen el mismo contenido");
        } else{
            System.out.println("Tienen distinto contenido");
        }
        //equalsIgnoreCase -> Ignora mayusculas y minusculas. 
        str2="EL LENGUAJE JAVA";
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Las dos cadenas son iguales");
        //CompareTo
        String str3 = "Anuel";
        String str4 = "Juan";
        int resultado = str3.compareTo(str4);
        if(resultado<0) System.out.println(str3+" es menor que "+str4);
        else if (resultado == 0) System.out.println("Son iguales");
        else System.out.println(str3+ " es mayor que "+str4);
        //Mayusculas y minusculas
        String str5 = str3.toLowerCase();
        String str6 = str4.toUpperCase();
        //replace y String.format
        String cade = "mama";
        String cade1 = cade.replace('m', 'p');
        System.out.println(String.format("He cambiado %s por %s", cade,cade1));
        // Formateo de cadenas: metodo estatico String.format
        System.out.println("************ String.format *************");
        String usuario = "zootropo"; 
        int mensajes = 36; 
        String s = String.format("%s escribió %d mensajes", usuario, mensajes);
        System.out.println(s);
        
        int num = 45;
        float num1 = 4.5f;
        System.out.println(String.format("El resultado de sumar %d con %f es %.2f"
                + "", num, num1,(num+num1)));
        
        
        float numFloat = 3.14159f;
        String s2 = String.format("PI es %.3f", numFloat);
        System.out.println(s2);
        
        int numInt = 1234;
        String s3 = String.format("El número es: %08d", numInt);
        //%08d indica que el numero tiene 8 caracteres por lo que si no llega a 8, rellena con 0
        //convertir un String en un array de caracteres
        s2 = "Esta es mi mamá";
        int tama = s2.length();
        char[] miArray = s2.toCharArray();
        System.out.println(Arrays.toString(miArray));
               
         
        //convertir un array de caracteres en un string
        System.out.println(String.valueOf(miArray));
        System.out.println("MÉTODOS DE LA CLASE CARÁCTER");
        boolean b = Character.isLetter('r');
        boolean d = Character.isDigit('8');
        boolean u = Character.isUpperCase('c');
        boolean l = Character.isLowerCase('c');
        System.out.println(b + " " + d + " " + u + " " +l);
        
        //CONVERTIR UN STRING EN ARRAY DE STRINGS
        String colores = "rojo,amarillo,verde,azul,morado,marrón";
        String[] arrayColores = colores.split(",");//separa donde esta la ','
        System.out.println(Arrays.toString(arrayColores));
        
        
        
        
    }

}
