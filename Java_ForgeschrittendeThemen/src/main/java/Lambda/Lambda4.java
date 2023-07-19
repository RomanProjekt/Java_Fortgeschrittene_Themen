/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambda;

import java.util.function.Function;

/**
 *
 * @author roman
 */
public class Lambda4 {
    
    public static String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
    
    public static void main(String[] args) {
        
        
        //Function<String, Strign> fn = Lamda Ausdruck 

        Function<String, String> fn = parameter -> parameter + " from lambda";
        
        
        String result = Lambda4.add("Message ", fn);
        System.out.println(result);

    }

}
