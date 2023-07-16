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
public class FI_Example6 {
    
    
    
    public static void main(String[] args) {
        
        String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t" };
        Comparator<String> c = (String s1, String s2) -> { return s1.trim().compareTo(s2.trim()); };
        Arrays.sort(words, c);
        
        System.out.println(Arrays.toString(words));
            
    }
    
}
