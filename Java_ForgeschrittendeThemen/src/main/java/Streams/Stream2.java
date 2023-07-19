/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author roman
 */
public class Stream2 {
    
    public static void main(String[] args) {
        
        
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(Integer.toString(i));
        }

        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String s = it.next();
            if (s.equals("15"))
                it.remove();
            System.out.println(s); // "15" noch enthalten
        }
        
       

        
  
        
    }
    
}
