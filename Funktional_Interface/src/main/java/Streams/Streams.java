/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;

/**
 *
 * @author roman
 */
public class Streams {
    
    public static void main(String[] args) {
        
        int[][] ints = {{1,2,4}, {45,56,56}, {584,45,404}};
        
        Arrays.stream(ints).forEach((i) -> {
                Arrays.stream(i).sorted().forEach((j) -> System.out.println(j));
        });
    }
    
}
