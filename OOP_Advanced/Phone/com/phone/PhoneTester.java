/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone;

/**
 *
 * @author m5pa1k
 */
public class PhoneTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Galaxy s3 = new Galaxy("s3", 34, "vodafone","hakuna matata");
        IPhone iPhone5s = new IPhone("5s", 11, "verizon", "why this earth");
        s3.displayInfo();
        iPhone5s.displayInfo();
        
    }
    
}
