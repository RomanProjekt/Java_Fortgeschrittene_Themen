/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams2;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams2 {
    
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5};
        
        System.out.println("---------------------------------------------------");
        Stream.of(nums).forEach((t) -> {
            System.out.println(Arrays.toString(t));
        });
        
        
    }
    
    
    public int summe(int n) {
        return n * n;
    }
    
}
