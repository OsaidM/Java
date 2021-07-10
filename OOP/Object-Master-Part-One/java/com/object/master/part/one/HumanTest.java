/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.object.master.part.one;

/**
 *
 * @author m5pa1k
 */
public class HumanTest {
    public static void main(String [] args){
        Human Osaid = new Human();
        Human lazem = new Human();
        Osaid.attack(lazem);
        System.out.println(lazem.health());
    }
}
