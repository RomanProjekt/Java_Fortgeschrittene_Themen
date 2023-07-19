/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datenstrom;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author roman
 */
public class Datenstrom {
    
    public static void main(String[] args) {

        DataInputStream in = null;
        int i;
        try {
            File file = new File("C:\\Users\\roman\\NetBeansProjects\\JavaTutorial\\src\\main\\java\\datenstrom\\test.txt");
            System.out.println(file.getName());
            in = new DataInputStream(new FileInputStream(file));
            while ((i = in.read()) != -1) {
                System.out.print(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe) {
            }
        }
    }
    
}
