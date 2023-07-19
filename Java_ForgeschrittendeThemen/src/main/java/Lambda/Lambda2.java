/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

/**
 *
 * @author roman
 */
public class Lambda2 {
    
    
    //https://javabeginners.de/Klassen_und_Interfaces/Lambda_Ausdruecke.php
    
    interface Printer { void print(); }

    public static void main(String[] args) {
        
        
        //Interface = () -> Nach dem Pfeil wird die Rückgabe Funktion definert System.out.println("Hello World");
        
        Printer p = () -> System.out.println("Hallo Welt!");
        p.print();    // "Hallo Welt!"
    }
    
}
