/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

import java.util.ArrayList;

/**
 *
 * @author roman
 */
public class FirstFunctionalInterface {
    
    public static void main(String[] args) {
        
        ArrayList<Character> liste = new ArrayList<>();
        for (int i = 65; i < 91; i++) {
            liste.add((char) i);
        }
        
        for (Character character : liste) {
            System.out.print(character);
        }
        
        
    }
    
}
