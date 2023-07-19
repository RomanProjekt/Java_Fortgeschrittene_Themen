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
public class Streams13 {
    
    public static void main(String[] args) {
        
        
        //Die oben bereits betrachtete Methode iterate() wurde in Java 9 erweitert. Eine überladene Variante kann nun mit einer Abbruchbedingung versehen werden. 
        Stream.iterate(0, i->i<10, i->i+1).forEach(System.out::println);
        
        
        
        
    }
    
}
