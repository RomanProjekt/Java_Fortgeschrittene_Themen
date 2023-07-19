/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams3;

import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams9 {
    
    public static void main(String[] args) {
        
        Integer[] i = new Integer[100];
        for (int num = 0; num < i.length; num++) {
            i[num] = new Random().nextInt(100);
        }

        int ergebnis = Stream.of(i).mapToInt(k -> k.intValue()).filter(k -> k % 3 == 0).limit(10).sum();
        System.out.println(ergebnis);
        
        
        
    }
    
}
