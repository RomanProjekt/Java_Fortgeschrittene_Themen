/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

/**
 *
 * @author roman
 */
public class FI_Example3 {
    
    //1. Must ein Funktionelles Interfaces defineren
    interface Square {
        int calculation(int x, int y);
    }
    
    public static void main(String[] args) {
        
        
        //2. Must die Methdoe für calcultion als Lamda definieren 
        Square s = (int x, int y) -> x * y;
        
        //Über das definerte Square s kannst du 
        //dann die Methode aufrufen s.calculation
        int antwort = s.calculation(16, 17);
        System.out.println(antwort);
        
    }
    
    
    
    
    
    
}
