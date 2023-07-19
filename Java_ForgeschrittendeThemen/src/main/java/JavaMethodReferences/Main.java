/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMethodReferences;

/**
 *
 * @author roman
 */
public class Main {
    
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }
    
    public static void main(String[] args) {
        
       
    
        // Referring static method  
        Sayable sayable = () -> Main.saySomething();  
        // Calling interface method  
        sayable.say();  
        
    }
    
}

interface Sayable{  
    void say();  
}  
