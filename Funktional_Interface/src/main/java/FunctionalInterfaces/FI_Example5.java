/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author roman
 */
public class FI_Example5 {
    
    public static void main(String[] args) {
        
        
        
        String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };
        
        Arrays.sort( words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.trim().compareTo(o2.trim());
            }
            
        });
       
        
    }
    
}
