/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importbibliotecaapp;

import acm.program.ConsoleProgram;

public class ImportBibliotecaApp extends ConsoleProgram{

    public void run(){
        println("Hola, mundo");
        println("Inserte dos numeros");
        int n1 = readInt("Primer numero: ");
        int n2 = readInt("Segundo numero: ");
        int total = n1+n2;
        println("El total es: "+total);
    }
    public static void main(String[] args) {
        new ImportBibliotecaApp().start(args);
    }
    
}
