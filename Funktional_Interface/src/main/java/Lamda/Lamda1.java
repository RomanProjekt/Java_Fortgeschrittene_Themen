/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author roman
 */
public class Lamda1 {
    
    
    interface SayMyName {
        String sayHello(String name);
        //String SayOnlyMyLastname(String lastname, String blabla);
    }
    
    
    
    public static void main(String[] args) {
        
        //Lamda Expression wird bei Listen angewendet 
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        
        
        //1. Lamda Expression
        numbers.forEach(System.out::println);
        numbers.forEach((x) -> System.out.println(x * x));
        
        
        //2. Mit Consumer   
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        numbers.forEach(method);
        
        
        //3. Functional Interface übergeben in einer Methode:
        SayMyName meineFunctionInterf = (String name) -> " " + name;
        System.out.println(GibtIrgendetwasAus("Hello", meineFunctionInterf));
        
        
        
    }
    
    public static String GibtIrgendetwasAus(String str, SayMyName name) {
        return str + " " + name.sayHello("Tom");
    }
    
    
    
}
