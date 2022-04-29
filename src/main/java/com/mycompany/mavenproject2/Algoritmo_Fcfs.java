/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;


import java.util.*;
import java.util.logging.Logger;
/**
 *
 * @author Manuel
 */
public class Algoritmo_Fcfs {
    private ArrayList<Proceso> procesos;
    private int[] tiempo_eje, tiempo_espera;
    private int contador;
    
    public Algoritmo_Fcfs(ArrayList<Proceso> procesos){
        this.procesos = procesos;
    }
    
    public void ejecutar() throws InterruptedException{
        
        for (int i = 0; i < this.procesos.size(); i++) {
            this.procesos.get(i).start();
            try{
                this.procesos.get(i).join();
            }catch(InterruptedException ex){
             Logger.getLogger(Mavenproject2.class.getName());
            }  
            
        }
        System.out.println("nohay objeto");
    }
    
}
