/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams5 {
    
    public static void main(String[] args) {
        
        Stream.iterate(0, i -> i + 1).limit(100).forEach(System.out::println);
        
        System.out.println("-------------------------------------------------");
        
        Stream.iterate(0, i -> i + 1).limit(100).forEach(i -> System.out.println(i));
        
    }
    
}
