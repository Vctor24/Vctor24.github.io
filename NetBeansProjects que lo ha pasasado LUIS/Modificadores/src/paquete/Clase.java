/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author diurno
 */
public class Clase {

    private final int maxAlus = 20;
    //Veo la diferencia entre modificadores public, private y nada.
    public String nombre;
    private int numAlus;
    int[] notas;

    public Clase(String nombreClase, int numAlus, int[] notas) {
        nombre = nombreClase;
        setNumAlus(numAlus);
        this.notas = notas;
    }

    //Uso sobrecarga de metodos
    public Clase() {
        nombre = "";
        numAlus = -1;
        notas = new int[maxAlus];
    }

    @Override
    public String toString() {
        String salida = "Clase:" + "nombre=" + nombre + "\nnumAlus=" + numAlus + "\n";
        if (notas != null) {
            for (int nota : notas) {
                salida = salida + "  " + nota;

            }
        } else salida = salida+ "no hay notas";
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAlus() {
        return numAlus;
    }

    public void setNumAlus(int numAlus) {
        if (numAlus < 0 || numAlus > maxAlus) {
            this.numAlus = 0;
        } else {
            this.numAlus = numAlus;
        }
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                notas[i] = 0;
            }
        }
        this.notas = notas;
    }

}
