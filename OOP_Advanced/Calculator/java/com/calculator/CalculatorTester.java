/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

/**
 *
 * @author m5pa1k
 */
public class CalculatorTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator newCal= new Calculator();
        newCal.setOperandOne(10);
        newCal.setOperation("+");
        newCal.setOperandTwo(13);
        newCal.performOperation();
        newCal.getResults();
        
    }
    
}
