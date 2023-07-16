/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/**
 *
 * @author roman
 */
public class DoubleConsumerEx {
    
    public static void main(String[] args) {
        
        //Bei Consumer ist kein Rückgabewert
        
        DoubleConsumer doublec =  (a)  -> { a *= 2;};
        doublec.accept(5);
        
        Consumer consumer = (ausgabe) -> System.out.println(ausgabe);
        doublec.andThen((DoubleConsumer) consumer).accept(5);
        
            
        
       
    }
    
}
