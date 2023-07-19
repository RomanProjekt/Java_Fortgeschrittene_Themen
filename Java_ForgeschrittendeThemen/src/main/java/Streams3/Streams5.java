/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams3;

import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams5 {
    
    public static void main(String[] args) {
        
        Stream.of("Ene", "mene", "muh", "und", "raus", "bist", "du").limit(3).forEach(System.out::println);
        
    }
    
}
