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
public class Streams12 {
    
    //Die Methode dropWhile(boolean b) überspringt eine Verarbeitung, solange eine Bedingung erfüllt ist und führt sie danach weiter aus: 
    
    
    public static void main(String[] args) {
        Stream.of(96, 168, 9, 104, 15).dropWhile(i -> i % 3 == 0).forEach(System.out::println);
    }

}
