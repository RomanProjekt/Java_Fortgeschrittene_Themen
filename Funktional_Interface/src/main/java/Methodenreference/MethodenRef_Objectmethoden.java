/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methodenreference;

import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class MethodenRef_Objectmethoden {
    
    public static void main(String[] args) {
        
        Consumer<String> out = System.out::println; 
        out.accept( "Kates kurze Kleider" );
        
        Runnable outRun = System.out::println; 
        outRun.run();
        
        
    }
    
}
