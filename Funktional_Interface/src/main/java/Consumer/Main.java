/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author roman
 */
public class Main {
    
    public static void main(String[] args) {
        
        Arrays.asList(1,2,3,4).forEach(System.out::println);
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Das ist ein ein Beispiel für einen Consumer");
        arrayList.forEach(System.out::println);
        
        
    }
    
}
