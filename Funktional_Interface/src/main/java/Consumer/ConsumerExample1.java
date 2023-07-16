/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class ConsumerExample1 {
    
    public static void main(String[] args) {
        
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
        
        
        //1. im ersten Consumer werdne die Elemente vergrößerst 
        Consumer<List<String>> upperCaseConsumer = list -> 
        {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        
        };
        
        //2. Consummer werden die Elemente ausgegeben - Kurzschreibweise
        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);
        
        
        //3. 
        upperCaseConsumer.andThen(printConsumer).accept(cities);

        
        
    }
    
}
