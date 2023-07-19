/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Consumer_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class ConsumerInterfaceExample {

    static void addList(List<Integer> list) {
        // Return sum of list values  
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of list values: " + result);
        System.out.println("Hello World!");
        
    }

    public static void main(String[] args) {
        // Creating a list and adding values  
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        
        // Referring method to String type Consumer interface   
        Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;
        consumer.accept(list);  // Calling Consumer method  
        
        
        
        Consumer<List<Integer>> consumer2 = ConsumerInterfaceExample::addList;
        consumer2.accept(list);  // Calling Consumer method  

    }

}
