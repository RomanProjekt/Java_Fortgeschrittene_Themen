/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author roman
 */
public class Streams1 {
    
      public static void main(String[] args) {
          
          //https://www.baeldung.com/java-stream-operated-upon-or-closed-exception
          
          String[] myArray = new String[2];
          myArray[0] = "Hello World!";
          myArray[1] = "Zweites Element";
          try (Stream streamString = Stream.of(myArray)) {
              
              System.out.println(streamString);
              System.out.println(streamString.count());
              System.out.println(streamString.toList().get(0));
              
              streamString.close();
              
              //System.out.println(streamString.findFirst());
              /*
              java.lang.IllegalStateException: stream has already been operated upon or closed
              at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
              at java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
              at javabeginners.Streams1.main(Streams1.java:24)
               */
          }
          
      }
    
}
