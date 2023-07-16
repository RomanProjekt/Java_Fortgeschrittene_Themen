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
public class FI_Example4 {
    
    public static void main(String[] args) {
        
        //1. Hier wird ein Comperator definiert, Buchstaben vergleichen 
        class TrimComperator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                return o1.trim().compareTo(o2.trim());
            }
        }
        String[] words = { "M", "\nSkyfall", "Q", "Das ist ein Satz mit O" };
        Arrays.sort(words, new TrimComperator());
        System.out.println(Arrays.toString(words));
        
        //Ergebnis: [Das ist ein Satz mit O , M, Q, 
        //           Skyfall]
        
    }
    
    
    public void CompareAbleFunktion() {
        
        class TrimComparaable implements Comparable<String> {

            @Override
            public int compareTo(String o) {
               return 0;
            }
            
        }
        
        
    }
    
    
    
}
