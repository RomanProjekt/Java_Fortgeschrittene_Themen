/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lamda;

/**
 *
 * @author roman
 */
public class LamdaRectangle {
    
    interface Rectangle {
        public double getArea(double a, double b);
    }
    
    public static void main(String[] args) {
        
        Rectangle rec = (double a, double b) -> {a*=2; b*=3; return a * b;};
        System.out.println(rec.getArea(12, 12));
    }
    
}
