/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author roman
 */
public class ForEachMöglichkeiten {
    
    public static void main(String[] args) {
        List<String> alphabets
                = new ArrayList<>(Arrays.asList("aa", "bbb", "cat", "dog"));
        alphabets.forEach(s -> System.out.println(s));
        
        
        alphabets.forEach(System.out::println);
        
        alphabets.forEach(s -> System.out.print(s + ","));
        
        
        alphabets.stream()
         .filter(s -> s.startsWith("a"))
         .forEach(System.out::println);
        
        alphabets.stream()
         .filter(s -> s.length() > 2)
         .forEach(System.out::println);
        
        
        
        
    }

}
