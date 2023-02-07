/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproducto;

import java.util.Objects;

/**
 *
 * @author diurno
 */
public class Producto {
    private String name;
    private double ganancia;
    private double precio;
    private float IVA;

    private Producto(String nombre, double precio, double ganancia, float IVA) {
        this.name = nombre;
        this.precio = precio;
        this.ganancia = ganancia;
        this.IVA = IVA;
    }
    public static Producto makeProd (String nombre, double precio, double ganancia, float IVA){
        if(correctProduct(nombre, precio, ganancia, IVA)) return new Producto (nombre, precio, ganancia, IVA);
        else return null;
    }
    
    public static boolean correctProduct(String nombre, double precio, double ganancia, float IVA){
        boolean result = false;
        if(nameOK(nombre) && precio > 0 && IVA >= 0 && IVA <=100 && ganancia >= 0){
            result = true;
        }
        return result;
    }
    public static boolean nameOK(String nombre){
        boolean result = false; 
        if(nombre != null){
         
         result = !nombre.trim().isEmpty();//quitamos los espacios en blanco y 
         //luego vemos si el espacio del string es 0 o no en el caso de que 
         //sea 0 significa que el string era de espacios en blanco. 
        }
        return result;
    } 

    @Override
    public String toString() {
        String nombretoString = name.toUpperCase().charAt(0)+ name.substring(1);
        return "Producto: " + "nombre=" + nombretoString+ ", ganancia=" + ganancia + ", precio=" + precio + ", IVA=" + IVA;
    }
    
    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) throws IVAOutOfRange {
        if(IVA >= 0 && IVA<=100)this.IVA = IVA;
        else throw new IVAOutOfRange();
    }
    //Metemos un metodo compare to para comparar productos. Compara productos y debe devolver:
    //   0: si son iguales
    //   Numero negativo si el objeto 1 es menor que el objeto 2.
    //   Numero positivo si el objeto 2 es menor que el objeto 1. 
    public int compareTo(Producto prod){
        //Tengo que decidir por que campo de los objetos producto voy a compararlo. 
        //Comparo por el campo nombre. El equals devuelve un booleano, mientras que el compareTo devuelve 0 si son iguales,
        //un numero negativo si el objeto 1 es menor que el objeto 2, y un numero positivo si el objeto 2 es menor que el objeto 1
//        int result = this.name.compareToIgnoreCase(prod.getNombre());
          int result = Double.compare(this.precio, prod.precio);
        return result; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!this.name.equalsIgnoreCase(other.name)|| this.precio != other.precio 
                || this.ganancia != other.ganancia ||this.IVA != other.IVA)
            return false;
//        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
        return true;
    }
    
}
