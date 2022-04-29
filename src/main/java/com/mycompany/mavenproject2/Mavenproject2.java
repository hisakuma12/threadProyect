/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        ArrayList<Proceso> procesos = new ArrayList<Proceso>();
        procesos.add(new Proceso(0, 2));
        procesos.add(new Proceso(1, 5));
        procesos.add(new Proceso(2, 3));
        
        Algoritmo_Fcfs fcfs = new Algoritmo_Fcfs(procesos);
        try {
            fcfs.ejecutar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mavenproject2.class.getName());
        }
        
        
    }
}
