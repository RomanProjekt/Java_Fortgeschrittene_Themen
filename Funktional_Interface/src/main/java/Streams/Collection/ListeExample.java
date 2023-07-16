/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams.Collection;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class ListeExample {
    
    
    //https://www.geeksforgeeks.org/collections-in-java-2/
    
    //List
    //Queue
    //Set
    //SortedSet
    //Map
    
    public static void main(String[] args) {

        List<String> listeArr = new ArrayList<>();
        
        

        Consumer<List<String>> consumer = listeAr -> {
            System.out.println("Hello Worldj!");
        };
        
       
        
        listeArr.forEach((t) -> {
            listeArr.add("String");
            System.out.println(t);
        });
                
        System.out.println(listeArr.size());

        List<String> listeLink = new LinkedList<>();
        Vector<String> vector = new Vector<>();

        //https://www.javatpoint.com/difference-between-arraylist-and-linkedlist 
    }
    
  
    
    
    
    
    
    
    
    
    
}
