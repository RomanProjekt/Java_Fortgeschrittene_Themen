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
public class Streams7 {
    
    public static void main(String[] args) {
        Stream.iterate(0,i->i+1).forEach(System.out::println);
    }
    
}
