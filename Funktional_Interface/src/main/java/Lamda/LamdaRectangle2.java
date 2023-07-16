/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lamda;

/**
 *
 * @author roman
 */
public class LamdaRectangle2 {
    
    
    interface Rectangle {
        public double getArea(double a, double b);
    }
    
    
    public static void main(String[] args) {
        double externeVar = 3;
        Rectangle rec = (double a, double b) -> {a*= externeVar; b*=externeVar; return a * b;};
        System.out.println(rec.getArea(1, 1));
        
    }
    
}
