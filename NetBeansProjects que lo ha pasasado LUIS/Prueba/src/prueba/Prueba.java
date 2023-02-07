/*
  To change this license header el gran dios chupapijas, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */

package prueba;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diurno
 */
public class Prueba {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
    
     
     
     

      
  
                  
 // area circunferencia
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Vamos a calcular el area de una circunferencia.");
        System.out.print("Cuál es el radio: ");  
        short r = teclado.nextShort();
        double ex = Math.pow(r, 2);
        double re = 3.1416*ex;
        System.out.println("El area es: "+ re);
        
    //    TRABAJAMOS CON LAS OPERACIONES ARITMETICOLÓGICAS
        
    byte j = 10; 
    
    boolean esCierto = j/j*j>j-j+j&&j==j%j||++j<--j+j--;
        System.out.println("Resultado: " + esCierto);
        
    


  



   
   
 }
   
    public static void TrabajoPreguntas()
    {
        //Pedir nombres y apellidos//
             Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe aqui tu nombre y tus apellidos: ");
        String nombre = teclado.next();
        teclado.nextLine();
        System.out.print("Ahora escribe tu frase favorita: ");
        String frase = teclado.nextLine();
        System.out.printf("%s tu frase favorita es %s ", nombre, frase);
    
    
    }
    public static void TrabajoVariables()
    {
    int entero;
     entero = 32464;
     String saludo;
     saludo="Hallo!";
     float nota;
     boolean llover;
     char car;
     double sueldo;
     final float PI;
     nota = 7.4f;
     llover = true;
     car = '@';
     sueldo = 10324.67;
     PI = 3.1416f;
     final short EBULLICION;
     EBULLICION = 100;
           System.out.print("Mi edad es: ");
        System.out.println(edad);
        if (edad<18)
        {
            System.out.println("Eres menor de edad");
        }
        else
        {
            System.out.println("Eres mayor de edad");
        }

       
        System.out.println(saludo + "en esta ciudad hay " + entero 
       + " habitantes");
        System.out.println("La nota media del alumnado del instituto de esta "
                + "ciudad es de un: " + nota);
        System.out.println("Mi correo es vchaves243"+car+"ieszaidinvergeles.org");
        System.out.println("Por este proyecto voy a cobrarle a la profe "+ sueldo +" €");
        System.out.println("Y por si no lo sabias, el número pi es " + PI + ", "
                + "y el agua empieza su proceso de ebullición a partir de "
                + "los "+ EBULLICION+ "ºC. De nada por esta clase de culturilla "
                        + "básica");
        
        System.out.print("Introduce un numero decimal: ");   
     Scanner teclado = new Scanner(System.in);
     float n1 = teclado.nextFloat();
        System.out.print("Introduce un numero decimal to largo: ");
     double n2 = teclado.nextDouble();
     double suma = n1+n2;
        System.out.print("El primer número es "+n1);
        System.out.print(", el segundo número es "+n2);
        System.out.println(" y el resultado de la suma es "+suma);
        
        System.out.printf("El resultado redondeado al segundo decimal de sumar"
                + " %.2f y %.2f es %.2f \n", n1, n2, suma);
        
        System.out.println("El resultado de sumar "+n1+ " y "+n2+" es "+suma);
  
    
    
    }
    public static void trabajoJO()
    {
   // TRABAJAMOS CON JOptionPane     
   
    String frase = JOptionPane.showInputDialog("Introduzca la frase");
    JOptionPane.showMessageDialog(null, frase);
   



    // LEEMOS UN ENTERO
   
   long entero = Long.parseLong(JOptionPane.showInputDialog("introduzca un "
           + "entero"));
   
   JOptionPane.showMessageDialog(null, entero);
   
   
    
    
    
    }
    public static void TrabajoCalculadora2ºgrado()
    {
          //Calculadora eqs 2º grado//
        Scanner teclado = new Scanner(System.in); 
        System.out.println("BIENVENIDO A TU CALCULADORA DE ECUACIONES DE SEGUNDO"
                + "GRADO");
        System.out.println("Sabiendo que la estructura de una ecuación de"
                + "2º grado es ax^2+bx+c, completa los siguientes valores para "
                + "solucionar la ecuación:");
        System.out.print("Escribe el valor de a: ");
        double a = teclado.nextDouble();
        
        System.out.print("Ahora introduce el valor de b: ");
        double b = teclado.nextDouble();
        
        System.out.print("Por último introduce el valor de c: ");
        double c = teclado.nextDouble();
        double potencia = Math.pow(b,2);
        double m = 4*a*c;
        double v = potencia - m; 
        double raiz = Math.sqrt(v); 
        
     
        double r1 = (-b - raiz)/ 2*a;
        double r2 = (-b + raiz)/ 2*a;

        
        
        
        System.out.println("El primer resultado es "+r1+ " y "+r2);
        System.out.printf("Los resultados redondeados son %.2f y %.2f \n", r1, r2);
     
    
    
    
    
    }
public static void Examen(){
    boolean encontrado = false; 
    short intento=1;
    while(encontrado==false && intento<=10){
    
    
    }
}

}
