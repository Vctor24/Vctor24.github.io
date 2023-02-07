package POO_CLASE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diurno
 */
enum Combustible {GASOLINA, GASOIL, ELECTRICO, HIBRIDO}
public class coche {
    //ATRIBUTOS
    String marca;
    String color;
    String matricula;
    String modelo;
    double km;
    Combustible combustible;
    int velocidad;
    
    //Metodos
//    public void inicializarCoche(String marcaCoche,String colorCoche,String matriculaCoche,String modeloCoche){
//        marca = marcaCoche;
//        color = colorCoche;
//        matricula = matriculaCoche;
//        modelo = modeloCoche;
//        velocidad = 0;
//    }
    
    public void arrancar(){
        velocidad = 10;
    }
    public void acelerar(){
        velocidad = velocidad + 10;
    }
    public void frenar(){
        velocidad = velocidad - 10; 
    }
    public void parar(){
        velocidad = 0;
    }
    //metodo constructor
     public coche(String marcaCoche,String colorCoche, String combustible){
        marca = marcaCoche;
        color = colorCoche;
        setCombustible(combustible);
        
        velocidad = 0;
    }
     //GETTERS
     public String getMarca(){
         return marca;
     }
     public String getColor(){
         return color;
     }
     public int getVelocidad(){
         return velocidad;
     }

    public Combustible getCombustible() {
        
        return combustible;
    }
     
     //SETTERS
     public void setMarca(String marca){
         this.marca = marca;
     }
     public void setColor(String colorCoche){
         color = colorCoche;
     }
     public void setVelocidad(int velocidadCoche){
         velocidad = velocidadCoche;
     }

    public void setCombustible(String combustible) {
        try{
            this.combustible = Combustible.valueOf(combustible.toUpperCase());
        } catch (IllegalArgumentException error){
            this.combustible = Combustible.GASOLINA;
        }
        
    }
     
     //REESCRITURA DE METODOS
    @Override
     public String toString(){
         String miCoche = "Tengo un " + getMarca() + " de color " + getColor() + 
                 ". Voy a " + getVelocidad() + " km/h. Y usa " +getCombustible();
         return miCoche;
     }
}
