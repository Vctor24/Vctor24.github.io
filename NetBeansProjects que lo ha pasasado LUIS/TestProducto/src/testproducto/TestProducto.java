/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproducto;

/**
 *
 * @author diurno
 */
public class TestProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod1 = Producto.makeProd("Victor", 1000, 21, 100);
        try {
            prod1.setIVA(-6);
        } catch (IVAOutOfRange e) {
            System.out.println(e.getMessage());
        }
        
        Producto prod2 = Producto.makeProd("Bictor", 120, 20, 100);
        if (prod1 != null && prod2 != null){
            System.out.println(prod1);
            System.out.println(prod2);
           
            int result = prod1.compareTo(prod2);//Usamos a la funcion de la clase. 
            if(result == 0) System.out.println("Son Iguales");
            else if (result < 0)System.out.println(prod1.getNombre() + " es menor que "
                    + prod2.getNombre());
            else System.out.println(prod1.getNombre() + " es mayor que " 
                    + prod2.getNombre());
        }
//            System.out.println("Son iguales?: " +prod1.equals(prod2));
       
    }
    
}
