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
public class Streams7 {
    
    public static void main(String[] args) {
        
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        
        //Liste + Stream + MAP + Collection
        
        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
       
        
        System.out.println(squareSet);
        
    }
    
}
