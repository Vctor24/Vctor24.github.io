/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa_2_22_23_alus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exa_2_22_23_ALUS {

    static Scanner teclado = new Scanner(System.in);

    enum Valores {
        CARISIMO, CARO, NORMAL, BARATO, OFERTON
    }

    public static void main(String[] args) {
//
        sacaValores();
        restaurante();

    }

    // 1 pto
//     sacaValores
    public static void restaurante() {
        int numMesas = pideNumMesas();
        int[] mesas = generaMesas(numMesas);
        System.out.println(Arrays.toString(mesas));
        byte comensales = pidecomensales();
        int numMesa = asignaMesa(mesas, comensales);
        if (numMesa != -1) {
            System.out.printf("Mesa número %d asignada. ", numMesa);
        } else {
            System.out.println("Lo sentimos, no hemos encontrado mesa");
        }

    }

    public static void sacaValores() {

        int valor = 1;
        Valores valor1 = Valores.BARATO;
        Valores valor2 = Valores.CARISIMO;
        Valores valor3 = Valores.CARO;
        Valores valor4 = Valores.NORMAL;
        Valores valor5 = Valores.OFERTON;
        System.out.printf("Valor %d = %s \nValor %d = %s \nValor %d = %s \n"
                + "Valor %d = %s \nValor %d = %s \n", valor++, valor1, valor++,
                valor2, valor++, valor3, valor++, valor4, valor++, valor5);
    }

    public static int pideNumMesas() {
        int mesas;
        do {
            System.out.println("Introduzca el numero de mesas: ");
            mesas = teclado.nextInt();
        } while (mesas < 2 || mesas > 50);
        return mesas;
    }

    public static int[] generaMesas(int nMesas) {
        int[] mesas = new int[nMesas];

        for (int i = 0; i < mesas.length; i++) {
            int alea = ThreadLocalRandom.current().nextInt(0, 5);
            mesas[i] = alea;
        }

        return mesas;
    }

    public static byte pidecomensales() {
        byte ncomensales = 0;
        
        do {
            
            try {
                System.out.println("Introduzca el numero de comensales (1-4)");
                ncomensales = teclado.nextByte();
            } catch (InputMismatchException error) {
                ncomensales = 0;
            }
            if (ncomensales == 0){
                System.out.println("Por favor, introduzca un numero");
            }
        }while (ncomensales == 0 || ncomensales<1 || ncomensales>4);
        
        return ncomensales;
    }
    public static int asignaMesa(int[]mesas, byte comensales){
        int asign = -1;
        int vueltas = 1;
        for (int i = 0; i < mesas.length; i++) {
            if(mesas[i]== 0){
                asign = i;
                
                break;
            }
            if(mesas[i]+comensales == 4){
                asign = i;
                
                break;
            }else if (mesas[i]+comensales == 3){
                asign = i;
                
                break;
            }
            vueltas++;
        }
        System.out.println("Vueltas: "+ vueltas);
        return asign;
    }
    
    // 1.5 ptos
// pideNumMesas

    // 1.5 ptos
//generaMesas
    // 2 ptos
//pidecomensales
    // 4 ptos
//asignaMesa
}
