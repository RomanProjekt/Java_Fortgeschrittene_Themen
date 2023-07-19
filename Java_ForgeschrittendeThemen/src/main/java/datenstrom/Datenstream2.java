/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datenstrom;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author roman
 */
public class Datenstream2 {
    public static void main(String args[]) {
         try {
             File file = new File("C:\\Users\\roman\\NetBeansProjects\\JavaTutorial\\src\\main\\java\\datenstrom\\test.txt");
             FileInputStream fin = new FileInputStream(file);
             int i = 0;
             while((i = fin.read()) != -1 ) {
                System.out.print((char) i);
             }

         } catch (Exception e) {
             System.out.println(e);
         }
    }
}
