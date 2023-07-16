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
public class Streams3 {
    
    public static void main(String[] args) {
        Stream.of("Ene", "mene", 12, "und", "raus", "bist", "du").
                limit(3).
                forEach(System.out::println);
        
        
        Stream.of("Ene", "mene", "muh", "und", "raus", "bist", "du").limit(3).forEach(i->System.out.println(i));
    }
}
