/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

/**
 *
 * @author roman
 */


//https://www.geeksforgeeks.org/lambda-expressions-java-8/

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);
  
    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}


public class Test {
    
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);
        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
    }
    
}
