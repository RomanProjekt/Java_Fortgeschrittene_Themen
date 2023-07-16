/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams6_MitPseudozahlen {
    
    public static void main(String[] args) {
        
        Integer[] i = new Integer[100];
        for (int num = 0; num < 10; num++) {
            i[num] = new Random().nextInt(100);
        }
        
        
        
        
        Optional<Integer> ergebnis = Stream.of(i).findAny();
        System.out.println(ergebnis.get());
                
                
                //mapToInt(k -> k).filter(k -> k%3 == 0).limit(10).sum();
        
        
        
    }
    
}
