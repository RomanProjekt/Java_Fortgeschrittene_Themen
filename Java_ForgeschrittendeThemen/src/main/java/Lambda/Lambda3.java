/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

/**
 *
 * @author roman
 */
public class Lambda3 {

    interface StringFunction {
        String run(String str);
    }

    public static void main(String[] args) {
        
        //Interface abc = (Strign s) ->  Definition der Rückgabe s + "Blal bla bal";
        
        StringFunction exclaim = (String s) -> s + "!";
        StringFunction ask = (String s) -> s + "?";
        
        
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

}
