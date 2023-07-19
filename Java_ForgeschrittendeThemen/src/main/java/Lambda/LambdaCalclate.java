/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

/**
 *
 * @author roman
 */
public class LambdaCalclate {
    
    //https://javabeginners.de/Klassen_und_Interfaces/Lambda_Ausdruecke.php
    
    interface Rectangle {
        public double getArea(double length, double width);
    }

    public static void main(String[] args) {
        
        
        double multi = 3;
        Rectangle rect = (l, w) -> { l*=multi; w*=multi; return l * w; };
        System.out.println("Flaeche:" + rect.getArea(4, 3));
    }
    
}
