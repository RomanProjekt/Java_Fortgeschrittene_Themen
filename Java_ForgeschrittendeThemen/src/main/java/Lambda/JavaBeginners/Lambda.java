/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda.JavaBeginners;

/**
 *
 * @author roman
 */
public class Lambda {
    
    interface Printer {
        public void print(String s, String t);
    }

    public static void main(String[] args) {

    Printer p = (s, t) -> 
    
    { t = t.toUpperCase(); 
    System.out.println(s + " " + t); 
    };
    
    p.print("Hallo", "Welt");    // Hallo WELT
    }

}


