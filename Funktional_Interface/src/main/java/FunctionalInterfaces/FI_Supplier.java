/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

import java.util.function.Supplier;

/**
 *
 * @author roman
 */
public class FI_Supplier {
    
    public static void main(String[] args) {
        Supplier<Long> two  = () -> { return 2L; };    
        System.err.println("Wert: " + two.get());
    }
    
}
