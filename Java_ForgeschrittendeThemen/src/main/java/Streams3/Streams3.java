/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams3;

import java.util.Arrays;

/**
 *
 * @author roman
 */
public class Streams3 {
    
    public static void main(String[] args) {

        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Arrays.stream(ints).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
        });

    }

}
