/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorreferenz;

import java.util.function.IntFunction;

/**
 *
 * @author roman
 */
public class RecursiveFactLambda {
    
    
    public static IntFunction<Integer> fact = (n)-> (n == 0) ? 1 : n * RecursiveFactLambda.fact.apply(n-1);
    
    public static void main(String[] args) {
        System.out.println( fact.apply( 1 ) ); 
        System.out.println( fact.apply( 2 ) );
        System.out.println( fact.apply( 3 ) );
    }
    
    
    
}
