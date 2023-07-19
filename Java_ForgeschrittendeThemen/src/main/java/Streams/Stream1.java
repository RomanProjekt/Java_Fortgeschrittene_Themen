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
public class Stream1 {
    
    
    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(Integer.toString(i));
        }

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s); // "15" entfernt
        }

        
    }
    
}
