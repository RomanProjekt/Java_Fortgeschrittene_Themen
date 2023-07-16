/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author roman
 */
public class StreamsEx32 {
    
    public static void main(String[] args) {
        
        List<String> listofString = List.of( "A", "B", "C", "D");
        
        
        //Das erste Element finden in der list
        Optional<String> erstes = listofString.stream().findFirst();
        System.out.println(erstes.get());
        
        
        Optional<String> findAny = listofString.stream().findAny();
        System.out.println(findAny.get());
        
        
            
    }
    
}
