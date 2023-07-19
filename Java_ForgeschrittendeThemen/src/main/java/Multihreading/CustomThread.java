/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multihreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roman
 */
public class CustomThread extends Thread {
    
    String name;
    Integer counter;
     
    CustomThread(String s) {
        this.name = s;
    }
    
    CustomThread(String s, Integer counter) {
        this.name = s;
        this.counter = counter;
    }
//
//    @Override
//    public void run() {
//        System.out.println("Starte Thread" + name);
//        
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(CustomThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.out.println("Beende Thread " + name);
//    }
    
    
    //Ohne Synchronized: 0 1.Thread 0 2.Thread;  1 1.Thread 1 2.Thread, ....  5. 1. Thread 5. 2. Thread 
    
    //Mit Synchronized: 0 1.Thread 1 1.Thread;  2 1.Thread 1 3.Thread ... 5. 1. Thread 
    //und dann erst 0. 2.Thread, 1 2.Thread ... 5. 2.Thread
    
    
    @Override
    public void run() {
        System.out.println("Starte Thread" + name);

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println(counter++);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("Beende Thread " + name);

    }
    
    
    
    
    
    
    
    
    
}
