/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

import java.util.Comparator;

/**
 *
 * @author roman
 */
public class FI_Example8 {
    
    public static void main(String[] args) {
        
        Comparator<String> c0 = (var x, var y) -> 0;
        System.out.println(c0.compare("s2", "s"));
            
    }
    
}
