/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roman
 */
public class Streams1 {
    
    public static void main(String[] args) {
        
        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x -> (x*x)).collect(Collectors.toList());
        
        List square2 = number.stream().map(x -> Print.print(x*x)).collect(Collectors.toList());
        
        List square3 = number.stream().map(x -> print(x*x)).collect(Collectors.toList());
        
        number.stream().map(x -> print(x*x)).collect(Collectors.toList());
        
        
    }
    
    public static Integer print(Integer a) {
        System.out.println(a);
        return a;
    }
   
    public static interface Print {

        public static Integer print(Integer a) {
            System.out.println(a);
            return a;
        }
        
        public default Integer print2(Integer zahl1) {
            return zahl1;
        }
    }
    
    public class Klasse1 {
        
    }

}



