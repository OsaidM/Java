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
public class Galaxy extends Phone implements Ringable{
    
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("version number: "+
        this.getVersionNumber() +
        " battery percentage: " +
        this.getBatteryPercentage() +
        " rengtone: " + this.getRingTone());
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "your device has been unblocked";
    }
    
}
