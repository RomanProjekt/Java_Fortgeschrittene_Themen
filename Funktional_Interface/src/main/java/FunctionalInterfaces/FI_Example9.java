/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;

/**
 *
 * @author roman
 */
public class FI_Example9 {
    
    interface FunctionInterface {
        
        void abstractFun(int x);
        
        default void normalFun() 
        {
            System.out.println("Hello World!");
        }
        
    }
    
     interface FunctionInterface2 {
        
        int abstractFun(int x);
        
        default void normalFun() 
        {
            System.out.println("Hello World!");
        }
        
    }
    
    
    public static void main(String[] args) {
        
        FunctionInterface funcInterface = (int x) -> {System.out.println(x);};
        
        FunctionInterface2 funcInterface2 = (int x) -> { return x;};
        
    }
    
}
