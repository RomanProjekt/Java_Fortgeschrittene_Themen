/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollection;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roman
 */
public class AbstractListDemo {
    
    public static void main(String[] args) {
        
        AbstractList<String> list = new ArrayList<>();
        ArrayList<String> arrlist = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        AbstractSequentialList<String> listseq = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        list.add("Geeks");
        list.add("Geeks");
        list.add("Geeks");
        list.add("Geeks");
        list.add("Geeks");
        list.add("20");
        System.out.println("AbstractList:" + list);
        
        System.out.println("-------------------------------------------------");
        
        arrlist.add("Geeks");
        arrlist.add("Geeks");
        arrlist.add("Geeks");
        arrlist.add("Geeks");
        arrlist.add("20");
        
        System.out.println("AbstractList:" + arrlist);
        System.out.println("-------------------------------------------------");
        
        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("20");
        
        System.out.println("AbstractList:" + list2);
        System.out.println("-------------------------------------------------");
        
        
        
    }
          
    
}
