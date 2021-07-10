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
public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    
    public double performOperation(){
        if(null == getOperation()){
            return 0;
        }else switch (getOperation()) {
            case "+":
            {
                double result = getOperandOne() + getOperandTwo();
                return result;
            }
            case "*":
            {
                double result = getOperandOne() * getOperandTwo();
                return result;
            }
            case "/":
            {
                double result = getOperandOne() / getOperandTwo();
                return result;
            }
            case "-":
            {
                double result = getOperandOne() - getOperandTwo();
                return result;
            }
            default:
                return 0;
        }
    }
        
        public void getResults(){
            double result = this.performOperation();
            System.out.println(result);
        }
        
        
    }
    
