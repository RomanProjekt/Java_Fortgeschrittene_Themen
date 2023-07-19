/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roman
 */
public class Streams6 {
    
    public static void main(String[] args) {
        
        List<String> names
                = Arrays.asList("Reflection", "Collection", "Stream");
        
        
        
        //Sortieren von Listen 
        
        
        //List + Stream + Sorted + Collection
        
        // demonstration of sorted method
        List<String> show
                = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        
    }
    
}
