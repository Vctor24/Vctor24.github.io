/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ieszaidinvergeles.dam.personaapp;

/**
 *
 * @author diurno
 */
public class coche {
    int idcoche;
    String marca;
    String modelo;
    double velocidadMaxima;
    public static void main(String[] args) {
        int idcoche = 1;
        String marca = "Mercedes";
        String modelo = "";
        double velocidadMaxima = 100;
        System.out.println(idcoche+""+marca);
        coche coche = new coche(idcoche, marca, modelo, velocidadMaxima);
        coche.i
    }
/**
 * 
 * @param idcoche explica cual es el identificador del coche
 * @param marca explica cual es la marca del vehiculo
 * @param modelo explica cual es el modelo
 * @param velocidadMaxima explica cual es la velocidad maxima que puede
 * alcanzar el coche.
 */
    public coche(int idcoche, String marca, String modelo, double velocidadMaxima) {
        
        this.idcoche = idcoche;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    /**
     * a sdasdf asfassdasf as
     * @param numero siusdf asdfasfasd 
     * @param args ssd asfasdfasfa dfas
     * @return 
     */
    
    public double inventado(int numero, String... args){
        return -0.0001;
    }
    
    
    
    
    
    
    
    
}
