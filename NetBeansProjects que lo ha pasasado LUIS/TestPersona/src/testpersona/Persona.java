/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpersona;



/**
 *
 * @author diurno
 */
public class Persona {
    enum Nacionalidad{ESPAÑOL, INGLES, ALEMAN, CUBANO, JAPONES, INDIO, APÁTRIDA}
    enum Sexo{HOMBRE, MUJER}
    byte edad;
    float altura;
    String nombre;
    float peso;
    String dni;
    Nacionalidad nacionalidad;
    boolean europeo; 

    public Persona(String nombre, float altura, float peso, String nacionalidad,
            String dni , byte edad) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.peso = peso;
        this.dni = dni;
        setNacionalidad(nacionalidad);
        this.europeo = europeo;
    }
    public Persona(){
        nombre = "";
        altura = 0;
        peso = 0;
        setNacionalidad("");
        dni = null;
        edad = -1;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad <= 120 && edad>=0) this.edad = edad;
        else this.edad = -1;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacion) {
        nacion = nacion.toUpperCase();
        try{
            nacionalidad = Nacionalidad.valueOf(nacion);
        } catch(IllegalArgumentException error){
            nacionalidad = Nacionalidad.APÁTRIDA;
        }
        //Ahora relleno el campo europeo
        setEuropeo();
    }

    public boolean isEuropeo() {
        return europeo;
    }

    public void setEuropeo() {
        switch (nacionalidad){
            case ESPAÑOL:
            case ALEMAN:
            case CUBANO:
                europeo = true;
                break;
            default:
                europeo = false;
        }
        
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre="
                + "" + nombre + ", peso=" + peso + ", dni=" + dni + ", "
                + "nacionalidad=" + nacionalidad + ", europeo=" + europeo + '}';
    }
    
    }
    

