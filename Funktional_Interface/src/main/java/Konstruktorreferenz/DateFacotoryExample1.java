/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktorreferenz;

import java.util.Date;

/**
 *
 * @author roman
 */
public class DateFacotoryExample1 {
    
    interface DateFactory { Date create(); }
    
    public static void main(String[] args) {
        
        DateFactory factory = Date::new;
        System.out.println(factory.create());
        
    }
    
}
