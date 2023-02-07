/*
 * Clase Producto
Campos: - nombre del producto
        - fecha de compra, fecha en la que se compró este producto
        - número de Albarán, donde figura la compra de este producto
        - pvp, precio por unidad
        - unidades de este producto, comprado en la fecha indicada con nº albarán indicado
        - preciototal --> saco el precio total, según el pvp, el nº de unidades 
                y el dto de la tienda y el mes indicado en la fecha
        - Un array bidimensional llamado descuentos que me dice, según el nº de tienda (de 5)
        y el nº de mes, qué descuento se aplica (aleatorio entre 0%, 10%, 20%, 35%, 50%)
 */
package examen1eval_22_23_facil_alus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Rut
 */
public class Producto {
    final byte numTiendas = 15;
    
    private String nombre;
    private LocalDate fecha;
    private String albaran;
    private double pvp;
    private int unidades;
    private double precioTotal;
    private int tienda;
    private int[][] descuentos;

    public Producto(String nombre, String fecha, double pvp, int unidades, int tienda) {
        this.nombre = nombre;
        this.pvp = pvp;
        this.unidades = unidades;
        this.tienda = tienda;
        setFecha(fecha);
        setAlbaran(nombre, fecha, tienda);
//        setDescuentos(this.descuentos);
//        setPrecioTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 1 pto  (setFecha)

    // 1 pto (getFecha)
    

    public String getAlbaran() {
        return albaran;
    }

    
    // 2 ptos
    public void setAlbaran(String nombre, String fecha, int tienda) {
        
        nombre = nombre.substring(0, 3).toUpperCase();
        fecha= fecha.replace('-', '.');
        if(getFecha() != null){
            
            this.albaran=(fecha+nombre+tienda);
        } else{
            this.albaran= ("YYYYMMDD"+nombre+tienda);
        }
        // El albarán será un String con la fecha + 3 primeros caracteres nombre 
        // + número de la tienda con dos dígitos
       
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getTienda() {
        return tienda;
    }

    public void setTienda(int tienda) {
        this.tienda = tienda;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    // 2,5 ptos
    public void setPrecioTotal() {
       
    }

    // 2 ptos
    public void setDescuentos(int[][]bidi) {
        int meses=12;
        int tienda = getTienda();
        int descuento;
        bidi = new int[tienda][meses];
        bidi[tienda][meses] = ThreadLocalRandom.current().nextInt(0, 61);
        
        if (bidi[tienda][meses]>=0 || bidi[tienda][meses] < 10) {
            descuento = 0;
        }
        
        if (bidi[tienda][meses]>=10 || bidi[tienda][meses] < 20) {
            descuento = 10;
        }
        
        if (bidi[tienda][meses]>=20 || bidi[tienda][meses] < 35) {
            descuento = 20;
        }
        
        if (bidi[tienda][meses]>=35 || bidi[tienda][meses] < 50) {
            descuento = 35;
        }
        
        if (bidi[tienda][meses]>=50) {
            descuento = 50;
        }
        this.descuentos=bidi;
    }

    public String getFecha() {
        String fechaesp;
        if(fecha !=null){
         DateTimeFormatter fechaf = DateTimeFormatter.ofPattern("E dd-MM-yyyy");
         fechaesp = fecha.format(fechaf);   
        } else{
            fechaesp = null;
        }
        
        return fechaesp;
    }

    public void setFecha(String fechastr) {
        try{
            LocalDate fechita = LocalDate.parse(fechastr, DateTimeFormatter.ofPattern(""
                + "yyyy-MM-dd"));
        fecha = fechita;
        }catch(DateTimeParseException error){
            fecha = null;
        }
    }
    
  
    
    public void muestraDescuentos() {
        final int numMeses = 12;
        for (int i = 0; i < numTiendas; i++) {
            System.out.println("Tienda " + i + ": ");
            for (int j = 0; j < numMeses; j++) {
                System.out.print(descuentos[i][j] + " ");
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Producto{Nombre=" + nombre + ", fecha=" + fecha + ", albaran=" 
                + albaran + ", pvp=" + pvp + ", unidades=" + unidades +", "
                + "tienda =" + tienda + ", precioTotal=" + precioTotal + '}';
    }
    
    
}
