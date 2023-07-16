/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roman
 */
public class FI_Example7 {
    
    public static void main(String[] args) {
        
        Callable<String> callable = () -> { return "Rückgabe"; };
        try {
            callable.call();
        } catch (Exception ex) {
            Logger.getLogger(FI_Example7.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
