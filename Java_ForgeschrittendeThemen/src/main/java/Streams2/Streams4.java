/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author roman
 */
public class Streams4 {
    
    public static void main(String[] args) {
        // create a list of String
        List<String> names
                = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        

        

        
    }

}
