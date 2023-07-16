/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author roman
 */
public class ListeDurchlaufen {
    
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Geeks");
        arrayList.add("Geeks");
        arrayList.add("Geeks");
        arrayList.add("Geeks");
        arrayList.add("Geeks");
        arrayList.add("20");
        
        
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
    
}
