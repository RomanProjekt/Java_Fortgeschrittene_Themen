/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author roman
 */
public class PredicateExample {
    
    public static void main(String[] args) {
        
        
        //A Predicate interface represents a boolean-valued-function of an argument. 
        //This is mainly used to filter data from a Java Stream.
        
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
        
        names.stream().filter(nameStartsWithS).forEach(System.out::println);
        
        
    }
    
}
