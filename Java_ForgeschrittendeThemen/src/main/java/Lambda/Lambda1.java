/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

/**
 *
 * @author roman
 */
public class Lambda1 {
  
    interface Addable {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        
        
        //Interface = (int a, int b) -> Nach dem Pfeil wird die Rückgabe Funktion definert (a + b )

        Addable ad1 = (int p1, int p2) -> (p1 + p2);
        System.out.println(ad1.add(10, 10));

    }

}
