/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Manuel
 */
public class Proceso extends Thread{

    private String nombre; 
    private int llegada, rafaga,  prioridad, tiempo_espera, tiempo_eje;
    
    
    public Proceso(int llegada, int rafaga, int prioridad) {
        this.llegada = llegada;
        this.rafaga = rafaga;
        this.prioridad = prioridad;
        
    }
    
    public Proceso(int llegada, int rafaga) {
        this.llegada = llegada;
        this.rafaga = rafaga;
    }
    
    public void run(){
        
    }
    /**
     * @return the llegada
     */
    public int getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    /**
     * @return the rafaga
     */
    public int getRafaga() {
        return rafaga;
    }

    /**
     * @param rafaga the rafaga to set
     */
    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /**
     * @return the tiempo_espera
     */
    public int getTiempo_espera() {
        return tiempo_espera;
    }

    /**
     * @param tiempo_espera the tiempo_espera to set
     */
    public void setTiempo_espera(int tiempo_espera) {
        this.tiempo_espera = tiempo_espera;
    }

    /**
     * @return the tiempo_eje
     */
    public int getTiempo_eje() {
        return tiempo_eje;
    }

    /**
     * @param tiempo_eje the tiempo_eje to set
     */
    public void setTiempo_eje(int tiempo_eje) {
        this.tiempo_eje = tiempo_eje;
    }
}
