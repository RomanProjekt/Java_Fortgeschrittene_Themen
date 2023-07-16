package ExceptionHandling;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roman
 */
public class ExceptionHandling {

    public static void main(String args[]) {
        try {
            //code that may raise exception  
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Das wird immer ausgeführt!");
        }
        //rest code of the program   
        System.out.println("rest of the code...");
        
    }

}
