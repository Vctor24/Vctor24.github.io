/*
 * Este examen fue hecho el 12 de Noviembre de 2022
Incluye: Funciones
         Fechas
         Arrays bidimensionales
         Strings
         Manejo de clases
 */
package examen1eval_22_23_facil_alus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rut
 */
public class Examen1Eval_22_23_Facil_ALUS {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = pideNombre();
        String fecha = pideFecha();
        
        int tienda = pideTienda();
        Producto tornillo = new Producto(nombre, fecha, 0.6, 30, tienda);
        
        System.out.printf("Fecha: %s\n", tornillo.getFecha());
        System.out.printf("Albarán: %s\n", tornillo.getAlbaran());
//        tornillo.muestraDescuentos();
//        System.out.println("Precio: " + tornillo.getPrecioTotal());
        System.out.println(tornillo.toString());
    }

    public static String pideNombre() {
        String nombre;
        do {
            System.out.print("Nombre del producto: ");
            nombre = entrada.nextLine();
            System.out.println("");
        } while (nombre.isEmpty());
        return nombre;
    }

    public static String pideFecha() {
        System.out.print("Fecha (formato yyyy-mm-dd): ");
        String fechaInglesa = entrada.nextLine();
        return fechaInglesa;
    }
    public static int pideTienda(){
        int ntienda = -1;
        do{
            try{
                System.out.println("Introduzca el numero de tienda: ");
                ntienda = entrada.nextInt();
            }catch(InputMismatchException error){
                System.out.println("...Algo ha salido mal");
                entrada.nextLine();
            }
        }while(ntienda<0 || ntienda>14);
        return ntienda;
    }
    // 1,5 puntos (pideTienda)
    
}
