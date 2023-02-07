/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depurador;

/**
 *
 * @author diurno
 */
public class LlenarNumeros {
   
    public static void main(String[] args) {
        int n = 50;
        int[] tabla; 
        tabla = llenar(n);
        int suma = sumar(tabla);
        System.out.println("La suma es: " + suma);
    }
    private static int[] llenar(int n) {
        int[] tabla = new int[n];
        for (int i = 0; i < n; i++) {
            tabla[i] = i * 10;
        }
        return tabla;
    } 
    private static int sumar(int[] tabla) {
        int suma = 0;
        int n = tabla.length;
        for (int i = 0; i < n; i++) {
            suma = suma + tabla[i];
        }
        return suma;
    } 
} 

