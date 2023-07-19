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
public class Streams11 {
    
    public static void main(String[] args) {
        
        //Java 9 Erweiterungen
        //https://javabeginners.de/Arrays_und_Verwandtes/Streams.php
        
        Stream.of(96, 168, 9, 104, 15).takeWhile(i->i%3==0).forEach(System.out::println);
        
        
        
        
    }
    
}
