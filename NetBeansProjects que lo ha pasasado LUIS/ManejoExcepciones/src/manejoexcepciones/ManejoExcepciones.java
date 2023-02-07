/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diurno
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EXCEPCIONES VERIFICADAS: FILENOTFOUNDEXCEPTION, IOEXCEPTION.
        //OPCION 1: meter un try catch dentro de la funcion. 
//        leerArchivoTexto();
        //OPCION 2: poner el try catch en el main o fuera de la funcion
        try {
            leerArchivoTexto2();
        } catch (FileNotFoundException error) {
            System.out.println("Archivo no encontrado");
        } catch (IOException error2) {
            System.out.println("Error en la lectura del archivo");
        } finally {
            System.out.println("He acabado el programa");
        }
        // EXCEPCIONES NO VERIFICADAS: RUNTIMEEXCEPTION.
//        lanzaExcepciones(); 
        //EXCEPCIONES PERSONALIZADAS:  ME LAS INVENTO YO. 
        lanzaMiExcepcion();
    }

    public static void leerArchivoTexto2() throws FileNotFoundException, IOException {

        BufferedReader aT = new BufferedReader(new FileReader("pruebaTexto.txt"));
//       leemos todas las lineas del archivo
        String linea;
        linea = aT.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = aT.readLine();
        }

    }

    public static void leerArchivoTexto() {
        try {
            BufferedReader aT = new BufferedReader(new FileReader("pruebaTexto.txt"));
        } catch (FileNotFoundException error) {
            System.out.println("Archivo no encontrado");
        }
    }

    public static void lanzaExcepciones() {
        try {
            divEntreCero();
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
//         leeNumeros();
        try {
            System.out.println("El numero es: " + leeNumeros());
        } catch (InputMismatchException err) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public static void divEntreCero() throws ArithmeticException {
        int n1 = 45;
        int n2 = 5;
        int result = n1 / n2;
        System.out.println("El resultado es: " + result);
    }

    public static int leeNumeros() { // al ser una excepcion no verificada, podemos omitir el throws. 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = teclado.nextInt();
        return n;
    }

    public static void lanzaMiExcepcion() {
        try {
            leeNumNo0();
        } catch (Excepcion0 er1) {
            System.out.println(er1.getMessage());
        }

    }

    public static void leeNumNo0() throws Excepcion0 {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca numero: ");
            num = teclado.nextInt();
            if (num == 0) {
                throw new Excepcion0(); // usamos throw para acceder a nuestra excepcion 
            }            // creando un objeto con new directamente. 
            if (num < 0) {
                try {
                    throw new ExcepcionNegativos();
                } catch (ExcepcionNegativos er2) {
                    System.out.println(er2.getMessage());
                }
            }
        } while (num != 0);

    }
}
