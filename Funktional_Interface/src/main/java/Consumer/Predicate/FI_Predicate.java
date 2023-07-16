/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Predicate;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

/**
 *
 * @author roman
 */
public class FI_Predicate {
    
    public static void main(String[] args) {
        
        //A Predicate interface represents a boolean-valued-function of an argument. 
        
        Predicate<Path>  exists = path -> Files.exists(path);
        Predicate<Path> directory = path -> Files.isDirectory( path );
        Predicate<Path> existsAndDirectory = exists.and( directory );
        
    }
    
}
