/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

/**
 *
 * @author roman
 */
public class VoidLamda {
    
    interface Printer {
        public void print(String s, String t);
    }
    
   public static void main(String[] args) {
        Printer p = (s, t) -> {
            t = t.toUpperCase();
            System.out.println(t);
        };
        
        Printer p2 = (String s1, String t1) -> {
            System.out.println("Hello World und weitere lustige Sachen! " + s1 + t1);
            int i = 0;
            if(i == 0) {
                System.out.println("weiterer Text");
            }
            
        
        };
        
        
        p.print("Hallo", "Welt");    // Hallo WELT
        p2.print("Das ist ", "ein leerer String");
    }         

    
}
