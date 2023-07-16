/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roman
 */
public class Streams {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = 
                (List) names.
                        stream().
                        filter(s->s.startsWith("S")).
                        collect(Collectors.toList());
    }
    
}
