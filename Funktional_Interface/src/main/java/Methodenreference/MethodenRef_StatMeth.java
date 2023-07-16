/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methodenreference;

import Lamda.Lamda1;
import java.util.function.BiFunction;

/**
 *
 * @author roman
 */
public class MethodenRef_StatMeth {
    
    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Integer> max = Math::max;
        Runnable r = HelloWorld::main;
        
    }
    
    public class HelloWorld {
        
        public static void main() {
            System.out.println("Hello World!");
        }
        
    }
    
    
    
    
}



