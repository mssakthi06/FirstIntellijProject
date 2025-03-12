package com.qa.javaconcepts;

public class staticBindingDemo {

    void interestRate(double rate){
        System.out.println("Interest Rate is: "+rate);
    }

    public static void main(String[] args) {
        staticBindingDemo sbd=new staticBindingDemo();
        sbd.interestRate(8.85);
    }
}
