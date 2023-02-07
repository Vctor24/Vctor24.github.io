/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author diurno
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//      ordenarNumeros();
//    Switch3();
//       EjemploTernario();
//        EjERelacion();
//        PedirNumeros();
//        Digitos();
    Comprovacion();
    }

    public static void alea() {
        short x = 5;

        short y = x++;  //De esta forma y=5 x=6, primero se hace el igual.

        System.out.printf("El valor de x es %s y el de y es %s \n", x, y);

        short x2 = 5;
        short y2 = ++x2;  //y=6 x=6

        System.out.printf("El valor de x es %s y el de y es %s \n", x2, y2);
        //Ecuación general de los números aleatorios: si quiero un intervalo de x a y : Math.random()*(y-x)+x    
        double z = Math.random() * 10 + 1; //números aleatorios del 0 al 11 sin incluir el último. 
        System.out.println(z);
        double z2 = Math.random() * 22 + 10; //Números aleatorios del 10 al 32, se multiplica por 22 pq si el numero que nos da es 1 por 22 es 22 más 10 es 32. 
        System.out.println(z2);

        int r = (int) Math.sqrt(2.3); //así se convierte el double que siempre va con la raiz a int. Trunca el resultado. 
        System.out.println(r);

        double rdn = Math.floor(5.56f);  //Truncas
        System.out.println("El truncamiento es " + rdn);
        double rdn2 = Math.round(5.56f);    //Redondeas
        System.out.println("El redondeo es " + rdn2);
        float n1 = 5.6884f;
        float r1 = (float) Math.round(n1 * 100) / 100; //Redondeo al segundo decimal. Usamos Math.round(double d) por lo que para que nos de float el resultado tenemos que poner (float) antes del Math.
        System.out.println(r1);

    }

    public static void alea2() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor minimo del numero aleatorio: ");
        int min = teclado.nextInt();
        System.out.print("Introduce el valor máximo del numero aleatorio: ");
        int max = teclado.nextInt();
        int alea = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("El nuevo aleatorio entre" + min + " y " + max + " es " + alea);

    }

    public static void sumasraras() {

        int j = 10;

        int y = j++ + j;
        System.out.println("El resultado de la primera operación: " + y);

        j = 10;
        y = j + j++;
        System.out.println("El resultado de la segunda operación: " + y);

        j = 10;
        y = ++j + j;
        System.out.println("El resultado de la tercera operación: " + y);

        j = 10;
        y = j + ++j;
        System.out.println("El resultado de la cuarta operación: " + y);

    }

    public static void Ej4() {

        double ncoches = (double) Long.parseLong(JOptionPane.showInputDialog("introduzca "
                + "cuantos coches has comprado: "));
        double coche = (double) Long.parseLong(JOptionPane.showInputDialog("introduzca lo "
                + "que ha costado el coche: "));
        double sueldo = ncoches * coche + 150 + 1000 + (coche * 0.05);
        JOptionPane.showMessageDialog(null, "El vendedor ha ganado con tu compra " + sueldo);

    }

    public static void ifs() {
        //Voy a la discoteca y si soy >18 entro y si tengo dinero
        //me pido una cocacola.
        // Ponen a Tiburon Fiestero y me pongo a bailar. A continuación, sexo.
        //si soy menor, me voy al cine. si está Avatar2, la veo y si no,
        //me voy a la bolera.
        //Antes de irme del cine me tomo un helado siempre.

        JOptionPane.showMessageDialog(null, "Bienvenido a la mejor disco der"
                + " mundo");

        int edad = (int) Long.parseLong(JOptionPane.showInputDialog("Introduzca "
                + "tu año de nacimiento para poder entrar"));
        int e = 2022 - edad;
        if (e >= 18) {
            int bebida = Integer.parseInt(JOptionPane.showInputDialog("Introduzca "
                    + "cuanto dinero has traido:"));
            JOptionPane.showMessageDialog(null, "Puedes entrar crack, pero son "
                    + "20€ :|");
            JOptionPane.showMessageDialog(null, "Hoy toca dj tiburon fiestero");
            JOptionPane.showMessageDialog(null, "Los refrescos valen 3 euros "
                    + "y las copas 8");
            if (bebida >= 20) {
                bebida = bebida - 20;
                JOptionPane.showMessageDialog(null, "Te quedan" + bebida + "€");
                byte beber = 1;

                while (beber == 1 && bebida >= 0) {

                    beber = (byte) Long.parseLong(JOptionPane.showInputDialog(""
                            + "¿Quieres tomar algo? si=1 no=0"));

                    if (bebida >= 3 && bebida < 8) {
                        JOptionPane.showMessageDialog(null, "Puedes pillarte solo un "
                                + "refresco");
                        byte decision = (byte) Long.parseLong(JOptionPane.showInputDialog("¿Quieres? sí=1/no=0"));
                        if (decision == 1) {
                            JOptionPane.showMessageDialog(null, "Aquí tienes una cocacola");
                            bebida = bebida - 3;
                            JOptionPane.showMessageDialog(null, "Te quedan " + bebida + "€");
                        }

                    }
                    if (bebida >= 8) {
                        JOptionPane.showMessageDialog(null, "Puedes pillarte una copa "
                                + "o una bebida");
                        byte decision = (byte) Long.parseLong(JOptionPane.showInputDialog(""
                                + "¿Qué quieres? nada= n numeros/copa=1/refresco=0"));
                        if (decision == 0) {
                            JOptionPane.showMessageDialog(null, "Aquí tienes tu refresco");
                            bebida = bebida - 3;
                            JOptionPane.showMessageDialog(null, "Te quedan" + bebida + "€");
                        }
                        if (decision == 1) {
                            JOptionPane.showMessageDialog(null, "Aquí tienes tu copa");
                            bebida = bebida - 8;
                            JOptionPane.showMessageDialog(null, "Te quedan" + bebida + "€");
                        } else {
                            JOptionPane.showMessageDialog(null, "Ps nada bro..."
                                    + "que disfrutes");
                            JOptionPane.showMessageDialog(null, "Te quedan" + bebida + "€");
                        }

                    }
                    if (bebida < 3) {
                        JOptionPane.showMessageDialog(null, "Te has quedado sin dinero, "
                                + "para beber tendrás q ir a la fuente o al baño");
                        bebida = bebida - ++bebida;
                    }

                }
                System.out.println("Qué guapa esta la música, amos a bailar...");
                System.out.println("Uuuii que chavala más guapa, vamos al ataque "
                        + "XD");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Chaval no cuela, a tu casa.");

            System.out.println("Pues me voy al cine");

            JOptionPane.showMessageDialog(null, "Bienvenido a cinema2000");

            double z = Math.random();
            double s = Math.round(z);
            if (s == 1) {
                JOptionPane.showMessageDialog(null, "Hoy está en cartelera "
                        + "Avatar 2. La entrada vale 5 euros.");
                System.out.println("Vamos! La que quería ver");
                float bebida = (float) Long.parseLong(JOptionPane.showInputDialog(""
                        + "Introduzca cuanto dinero has traido:"));
                if (bebida < 5) {
                    JOptionPane.showMessageDialog(null, "Lo siento pero no tienes suficiente "
                            + "dinero para verla");

                }
                if (bebida >= 5) {
                    JOptionPane.showMessageDialog(null, "En la sala nº 5 se va"
                            + " a proyectar, tome el ticket");
                    System.out.println("Gracias.");
                    bebida -= 5;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Hoy no está en cartelera "
                        + "Avatar 2");
                System.out.println("Que rollo! Pues me voy a "
                        + "la bolera");
                JOptionPane.showMessageDialog(null, "Bienvenido a la bolera. "
                        + "Jugar vale 5 euros.");
                int bebida = (int) Long.parseLong(JOptionPane.showInputDialog(""
                        + "Introduzca cuanto dinero has traido:"));
                if (bebida < 5) {
                    JOptionPane.showMessageDialog(null, "Lo siento pero no tienes suficiente "
                            + "dinero para verla");

                }
                if (bebida >= 5) {
                    JOptionPane.showMessageDialog(null, "En la sala nº 5 se va"
                            + " a proyectar, tome el ticket");
                    System.out.println("Gracias.");
                    bebida -= 5;
                }
            }
            System.out.println("Ahora me apetece comerme un helado..."
                    + "Espero que haya de vainilla");
            JOptionPane.showMessageDialog(null, "Los helados de vainilla  "
                    + "valen 2 euros");
            int bebida = (int) Long.parseLong(JOptionPane.showInputDialog(""
                    + "Introduzca cuanto dinero has traido:"));
            if (bebida < 2) {
                JOptionPane.showMessageDialog(null, "Lo siento pero no tienes suficiente "
                        + "dinero para comprar un helado");
                System.out.println("Pues nada...Me voy a casa.");
            }
            if (bebida >= 2) {
                JOptionPane.showMessageDialog(null, "Aquí tienes tu helado de "
                        + "vainilla");
                System.out.println("Gracias.");
                bebida -= 2;
                System.out.println("Vamoos, perfecto... Ya me puedo ir a "
                        + "casa contento.");
            }

        }

    }

    public static void ordenarNumeros() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        double n1 = entrada.nextDouble();
        System.out.print("Dime otro numero: ");
        double n2 = entrada.nextDouble();
        System.out.print("Dime otro numero: ");
        double n3 = entrada.nextDouble();

        if (n1 >= n2) {

            if (n2 >= n3) {

                System.out.println(n1 + " > " + n2 + " > " + n3);

            }
        } else {

            if (n1 >= n3) {

                System.out.println(n2 + " > " + n1 + " > " + n3);

            } else if (n2 >= n3) {

                if (n3 >= n1) {

                    System.out.println(n2 + " > " + n3 + " > " + n1);

                } else {

                    System.out.println(n2 + " > " + n1 + " > " + n3);

                }

            } else if (n3 >= n2) {

                if (n1 >= n2) {

                    System.out.println(n3 + " > " + n1 + " > " + n2);

                } else {

                    System.out.println(n3 + " > " + n2 + " > " + n1);

                }
            }
        }

    }

    public static void Switch1() {

//los lunes y miercoles llevo al niño al padel 
//los martes y jueves lo llevo a la natación
//los viernes al cine
//opcion 1: pregunrar el dia de la semana
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué dia de la semana es? ");
        String dia = teclado.next();
        switch (dia) {
            case "Lunes":
                System.out.println("Lo llevo al padel");
                break;
            case "Miercoles":
                System.out.println("Lo llevo al padel");
                break;
            case "Martes":
                System.out.println("Lo llevo a natacion");
                break;
            case "Jueves":
                System.out.println("Lo llevo a natacion");
                break;
            case "Viernes":
                System.out.println("Lo llevo al cine");
                break;
            default:
                System.out.println("Día libre");
                break;
        }

    }

    public static void Switch2() {

//Voy a lanzar un dado y si salen los números 2, 3 y 6: Ganar una lampara
//Si salen el 1 o el 5: Voy a ganar un viaje
//Si sale 4: Voy a ganar un apartamento en Torrevieja
        byte jugada = (byte) ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("La jugada ha dado como resultado: " + jugada);
        switch (jugada) {
            case 5:
            case 1:
                System.out.println("He ganado una lampara!");
                break;
            case 6:
            case 3:
            case 2:
                System.out.println("He ganado un viaje!");
                break;
            case 4:
                System.out.println("He ganado un apartamento!");
                break;

        }

    }

    public static void Switch3() {
        byte mes = (byte) ThreadLocalRandom.current().nextInt(1, 13);
        switch (mes) {
            case 1:
                System.out.println("Es Enero");
                break;
            case 2:
                System.out.println("Es Febrero");
                break;
            case 3:
                System.out.println("Es Marzo");
                break;
            case 4:
                System.out.println("Es Abril");
                break;
            case 5:
                System.out.println("Es Mayo");
                break;
            case 6:
                System.out.println("Es Junio");
                break;
            case 7:
                System.out.println("Es Julio");
                break;
            case 8:
                System.out.println("Es Agosto");
                break;
            case 9:
                System.out.println("Es Septiembre");
                break;
            case 10:
                System.out.println("Es Octubre");
                break;
            case 11:
                System.out.println("Es Nobiembre");
                break;
            case 12:
                System.out.println("Es Diciembre");
                break;

        }

    }

    public static void EjemploTernario() {
        System.out.print("Introduce un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String res = (numero % 3 == 0) ? "Es múltiplo de 3" : "No es múltiplo de 3";
        System.out.println(res);

    }

    public static void EjERelacion() {
        double horas = (double) Long.parseLong(JOptionPane.showInputDialog("Introduzca "
                + "cuantas horas a la semana trabajas: "));

        double sueldo;
        if (horas > 40) {
            sueldo = (40 * 16) + ((horas - 40) * 20);
            JOptionPane.showMessageDialog(null, "Tu salario semanal es: " + sueldo + "€");
        } else {
            sueldo = (40 * 16);
            JOptionPane.showMessageDialog(null, "Tu salario semanal es: " + sueldo + "€");
        }

    }

    public static void Pares() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void Impares() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void PedirNumeros() {
        int i = 1;
        while (i != 0) {
            i = (int) Long.parseLong(JOptionPane.showInputDialog("Introduzca"
                    + "un numero: "));

        }

        System.out.println("Correcto");

    }

    public static void Carta() {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        while (i != 4) {
            System.out.println("1.Beber  2.Comer  3.Copas  4.Salir");
            System.out.print("Introduzca una opción: ");
            i = teclado.nextInt();
            if (i > 4) {
                System.out.println("Opcion no valida, introduzcala de nuevo");
            }
            if (i == 1) {
                System.out.println("Has bebido");
            }
            if (i == 2) {
                System.out.println("Has comido");
            }
            if (i == 3) {
                System.out.println("Has tomado copas");
            }

        }
        System.out.println("Ta luego");

    }

    public static void Digitos() {
        double i = 0;
        long u = 1; 
        int j = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        i= teclado.nextDouble();
        while (u != 0){
            i=i/10;
            u = Math.round(i);
            j++;
                      
        }
        System.out.println("El numero tiene "+j+" numeros.");
    }

public static void Practica(){
    int num=0;
    
    
    while(num<=10){
        System.out.println(num); 
        num = num+1;
        
      
    }
    
    do{
        System.out.println(num);
        num = num+1;
    }while(num<=10);
    
    for(num=0; num<=10; num++){
        System.out.println(num);
    }
}
public static void Practica2(){
    int num=10;
    
    
    while(num>0){
        System.out.println(num); 
        num = num-2;
        
      
    }
        num=10;
    
    do{
        System.out.println(num);
        num = num-2;
    }while(num>0);
    
    for(num=10; num>0; num=num-2){
        System.out.println(num);
    }
}

public static void EjE(){
//    e.  Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0 y 100 y 
//        luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor respecto al número N 
//        aleatorio.
//        El proceso termina cuando el usuario acierta o cuando el número de intentos llega a 10.
Scanner teclado = new Scanner (System.in);
int ale = ThreadLocalRandom.current().nextInt(0,101);
int in = 0;
    System.out.println("BIENVENIDO AL ADIVINATOR VERSION NUMEROS");
    System.out.println("----------------------------------------");
    System.out.print("Dime un número: ");
    int n = teclado.nextInt();
    while (n<ale && in<=10){
        System.out.println("Es menor que el número");
        System.out.print("Dime otro número: ");
        n = teclado.nextInt();
        in++;
    }
    while (n>ale && in<=10){
        System.out.println("Es mayor que el número");
        System.out.print("Dime otro número: ");
        n = teclado.nextInt();
        in++;
    }
    if (in>10){
        System.out.println("F...FALLASTE");    
    }else{
        System.out.println("¡¡¡¡HAS ACERTADO!!!!");
    }

    
}   

public static void Ejercicioubucles(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("A continuación se le pedirán un total de 10 sueldos.");
    int s, csuel = 0, sumasuel = 0, n = 1;
    for (int i = 0; i<10; i++){
     
        System.out.print("Ingrese el salario "+n+": ");
        n++;
        s = teclado.nextInt();
        sumasuel = sumasuel + s;
        
        if (s > 1500){
            csuel++;
        }
    
    } 
    System.out.println("La suma de los sueldos es "+sumasuel+" y hay "+csuel+ " "
            + "sueldos mayores de 1500 €.");
    
    
}

public static void Comprovacionej4(){
    //ejercicio 4 corregido. 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de dinero: ");
    int dinero = teclado.nextInt();
    byte alea = 1;
    while (alea != 0){
        alea = (byte) ThreadLocalRandom.current().nextInt(-2,3);
        switch(alea){
            case-2:
                dinero = dinero-3;
                System.out.println("Le quedan "+dinero+" €");
                break;
            case -1:
                dinero = dinero-4;
                System.out.println("Le quedan "+dinero+" €");
                break;
            case 1:
                dinero = dinero+5;
                System.out.println("Le quedan "+dinero+" €");
                break;
            case 2:
                dinero++;
                System.out.println("Le quedan "+dinero+" €");
                break;
            case 0: break;    
        }
    }
    System.out.println("Ha acabado con "+dinero+" €");
    
    
}

public static void Comprovacion(){
    //pedir al usuario un entero entre 2 y 20. si el numero no esta dentro 
    //del rango, informar al usuario y volver a pedirle otro numero. 
    //Si el número está entre 2 y 20, le calculo el factorial. 
    Scanner teclado = new Scanner(System.in);
    int num; 
    System.out.print("Introduce un numero entre el 2 y el 20: ");    
    num = teclado.nextInt();
    while(num<2 || num>20){
        System.out.println("El numero no es correcto, introduce otro: ");
        num = teclado.nextInt();
    }
    int aux = 1;
    for (int i = num; i>0; i--){
        aux = aux*i;
    }
    System.out.println("El factorial es: "+aux);
}
}
