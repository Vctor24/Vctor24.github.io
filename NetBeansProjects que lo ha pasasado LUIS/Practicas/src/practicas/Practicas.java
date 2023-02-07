/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        divisionFuncion();
    }

    public static void Repasobucles1() {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Introducza un número: ");
        n = teclado.nextInt();
        int c = 0;
        boolean t = true;
        while (t) {

            if (c > 0) {
                System.out.print("Introducza un número: ");
                n = teclado.nextInt();

            }

            if (n >= 0) {
                int s = (int) Math.pow(n, 2);
                System.out.println("El número que has introducido al cuadrado es " + s);
                c++;
            } else {
                t = false;
            }

        }

    }

    public static void Repasobucles2() {
        //Leer un número e indicar si es positivo o negativo. 
        //El proceso se repetirá hasta que se introduzca un 0.

        Scanner teclado = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.print("Introduzca un número: ");
            n = teclado.nextInt();
            if (n < 0) {
                System.out.println("El numero " + n + " es negativo");
            } else if (n > 0) {
                System.out.println("El numero " + n + " es positivo");
            }
        }
        System.out.println("El numero que has introducido es 0, por lo que se "
                + "acaba el programa");

    }

    public static void Repasobucles3() {
        //Leer números hasta que se introduzca un 0. 
        //Para cada uno indicar si es par o impar.

        Scanner teclado = new Scanner(System.in);
        int e = 1;
        while (e != 0) {
            System.out.print("Introduce un numero: ");
            e = teclado.nextInt();
            if (e % 2 == 0 && e != 0) {
                System.out.println("El numero " + e + " es par.");
            } else if (e % 2 != 0) {
                System.out.println("El numero " + e + " es impar.");
            }

        }
        System.out.println("Como el numero que has introducido es el 0, "
                + "se termina el programa.");
    }

    public static void Repasobucles4() {
        //Pedir numeros hasta q se introduzca uno negativo, poner cuantos se han
        //introducido cuales 
        Scanner teclado = new Scanner(System.in);

        int a = 0, b = 0, c = 0, n;
        System.out.print("Introduzca un número: ");
        n = teclado.nextInt();
        while (n >= 0) {

            if (n % 2 != 0) {
                a++;

            } else {
                b++;

            }
            c++;
            System.out.print("Introduzca de nuevo un número: ");
            n = teclado.nextInt();
        }
        System.out.println("Ha introducido " + c + " números de los cuales " + b + " son"
                + " pares y " + a + " son impares.");
    }

    public static void sumaFuncion() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un nº: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce otro nº: ");
        int n2 = teclado.nextInt();
        int suma = funcionesPractica(n1, n2);
        System.out.println(suma);
    }

    public static int funcionesPractica(int n1, int n2) {
        int re = n1 + n2;

        return re;
    }

    public static void multiplicacionFuncion() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un nº: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce otro nº: ");
        int n2 = teclado.nextInt();
        int multi = funcionesPractica2(n1, n2);
        System.out.println(multi);
    }

    public static int funcionesPractica2(int n1, int n2) {
        int re = n1 * n2;
        return re;
    }

    public static void divisionFuncion() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un nº: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce otro nº: ");
        int n2 = teclado.nextInt();
        int div = funcionesPractica3(n1, n2);
        System.out.println(div);
    }

    public static int funcionesPractica3(int n1, int n2) {
        int re = n1 / n2;
        return re;
    }

}
