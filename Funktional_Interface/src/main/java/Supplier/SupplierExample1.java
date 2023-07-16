/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author roman
 */
public class SupplierExample1 {
    
    public static void main(String[] args) {
        
         List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
         Supplier<Double> randomValue = () -> Math.random();
         System.out.println(randomValue.get());
         
        
    }
    
}
