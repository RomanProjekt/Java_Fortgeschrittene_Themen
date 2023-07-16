/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methodenreference;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author roman
 */
public class Methodenreferenz_Objektmethode_Typs {
    
    public static void main(String[] args) {
        
        Object[] words = {"", '3', null, "2", 1, "" };
        
        Arrays.stream(words).
                filter(Objects::nonNull).   //Predicate
                map(Objects::toString).     //Function Interface übergeben
                map(String::trim).          //Function Interface übergeben 
                filter(s -> ! s.isEmpty()). //Predicat
                map(Integer::parseInt).     //Function Interface übergeben
                sorted().forEach(System.out::println); //Consumer Interface übergeben
        
    }
    
}
