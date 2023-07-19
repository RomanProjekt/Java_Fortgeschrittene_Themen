/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author roman
 */
public class JavaTutorial {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x-> multiplizieren(x)).collect(Collectors.toList());
        
        for (Integer integer : square) {
            System.out.println(integer);
        }
    }
    
    
    public static int multiplizieren(int x) {
        return x * x;
    }
}
