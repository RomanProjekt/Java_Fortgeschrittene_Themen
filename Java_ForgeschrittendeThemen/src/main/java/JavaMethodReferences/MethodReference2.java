/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMethodReferences;

/**
 *
 * @author roman
 */
public class MethodReference2 {
    
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2 = new Thread(MethodReference2::ThreadStatus);  
        t2.start();       
    }  
    
}
