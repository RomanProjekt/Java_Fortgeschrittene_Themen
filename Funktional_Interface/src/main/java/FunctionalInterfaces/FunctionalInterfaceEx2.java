/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalInterfaces;



 
interface Square {
    int calculate(int x);
}
 
public class FunctionalInterfaceEx2 {
    public static void main(String args[])
    {
        int a = 5;
 
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
 
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
