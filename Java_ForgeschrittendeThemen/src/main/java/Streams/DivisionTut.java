/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

/**
 *
 * @author roman
 */
public class DivisionTut {
    
    public static void main(String[] args) {
        
        try {
            int ergebnis = 2 / 0;
        } catch(Exception ex ) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
        
        
        
    }
    
}
