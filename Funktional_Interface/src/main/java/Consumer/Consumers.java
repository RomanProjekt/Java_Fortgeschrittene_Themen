/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 *
 * @author roman
 */
public class Consumers {
    
    //A Consumer is a functional interface that accepts a single input and returns no output.
    
    public static <T> Consumer<T> measuringConsumer( Consumer<T> block ) {

    return t -> {

      long start = System.nanoTime();

      block.accept( t );

      long duration = System.nanoTime() - start;

      Logger.getAnonymousLogger().info( "Ausführungszeit (ns): " + duration );

    };

  }
    
    public static void main(String[] args) {
         Arrays.asList(123,34, 34,3,3).forEach(measuringConsumer(System.out::println));
    }
    
}
