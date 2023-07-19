/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author roman
 */
public class Streams5 {
    
    public static void main(String[] args) {
        
        
        //1. Liste + Stream + MAP + FOREACH
        
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        
        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        
        //----------------------------------------------------------------------
        
        
        //2. Liste + Stream + Filter + Reduce 
        
        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
    }
    
}
