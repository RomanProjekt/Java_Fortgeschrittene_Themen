/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class ConsumerForLamda {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(05);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        
        
        Consumer<Integer> method = (var n) -> {
            n = n * 2;
            System.out.println(n);
        };      
        numbers.forEach(method);
    }

}
