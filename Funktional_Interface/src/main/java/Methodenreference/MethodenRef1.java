/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methodenreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

class StringUtils {

  public static int trimCompare( String s1, String s2 ) {

    return s1.trim().compareTo( s2.trim() );

  } 

}

public class MethodenRef1 {
    
    public static void main(String[] args) {
        
        String[] words = { "Z", "B", "a" };
        
        //Lamda Expression mit verschieden Listen verbunden 
        
        
        Arrays.sort(words, (String s1, String s2) -> StringUtils.trimCompare(s1,s2));
        System.out.println(Arrays.toString(words));
        
        //Kurzschreibweise 
        Arrays.sort(words, StringUtils::trimCompare);
        System.out.println(Arrays.toString(words));
        
        
        //Gleicher Code für eine Methodenreferenz kann 
        //zu komplett unterschiedlichen Typen führen – 
        //der Kontext macht den Unterschied:
        Comparator<String> c1 = StringUtils::trimCompare;
        BiFunction<String,String,Integer> c2 = StringUtils::trimCompare;
        
        
        
    }
    
}
