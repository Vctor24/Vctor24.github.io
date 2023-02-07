/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsarraysbidi;

import java.util.Scanner;
import examenpractica.*;

/**
 *
 * @author diurno
 */
public class EjsArraysBidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ej3();
        // TODO code application logic here
    }

    public static void ej3() {
        int nc = pedirColumnas();
        int f = ((nc - 1) / 2) + nc;
//        System.out.println(f);
        char[][] cruz = new char[f][nc];
        int x1 = nc / 2;
        for (int fila = 0; fila < cruz.length; fila++) {
            for (int columna = 0; columna < cruz[0].length; columna++) {
                if(columna == x1 || fila == x1){
                    cruz[fila][columna] = 'x';
                }else{
                    cruz[fila][columna] = ' ';
                }
                
            }

        }
        ExamenPractica.mostrarArrayBidiI(cruz);
    }
    //Arrays.fill(miArray[i], 'x') -> rellena todo el array de la fila i con el valor 'x' . 
    public static int pedirColumnas() {
        Scanner teclado = new Scanner(System.in);
        int c;
        do {
            System.out.print("Introduzca numero de columnas, ha de ser impar y minimo 3: ");
            c = teclado.nextInt();
        } while (c % 2 == 0 && c < 3);
        return c;

    }
}
