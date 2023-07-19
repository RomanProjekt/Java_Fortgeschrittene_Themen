/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multihreading;

/**
 *
 * @author roman
 */
public class Main {
    
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread(" erster Fred");
        CustomThread t2 = new CustomThread(" zweiter Fred");
        
        //t1.start();
        //t2.start();
        
        //---------------------------------------------------
        
        Integer counter = 0;
        
        CustomThread t12 = new CustomThread(" erster Fred", counter);
        CustomThread t22 = new CustomThread(" zweiter Fred", counter);
        
        t12.start();
        t22.start();
        
        
    }
    
}
