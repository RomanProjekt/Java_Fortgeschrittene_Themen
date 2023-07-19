/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams3;

import java.util.Stack;

/**
 *
 * @author roman
 */
public class Streams4 {
    
    
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(1024);
        stack.push(8);
        stack.push(127);

        stack.stream().sorted().forEach(n -> System.out.println(n + ", "));

        System.out.println();

        for (int i : stack) {
            System.out.print(i + ", ");
        }

    }
    
}
