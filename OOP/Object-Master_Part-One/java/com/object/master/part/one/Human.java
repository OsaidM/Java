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
public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    
    
    public int health(){
        
        return this.health;
    }
    
    public int setHealth(int a){
        this.health = a;
        return this.health;
    }
    
    public int strength(){
        
        return this.strength;
    }
    public void attack(Human otherHuman){
        int otherHealth = otherHuman.health();
        otherHuman.setHealth(otherHealth-strength);
        
    }
}
