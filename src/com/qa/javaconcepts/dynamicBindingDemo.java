package com.qa.javaconcepts;

class   DynamicClass{
    void dinterestRate(double rate){
        System.out.println("Interest Rate from DynamicClass: "+rate);
    }
}
public class dynamicBindingDemo extends DynamicClass{
    void dinterestRate(double rate){
        System.out.println("Interest Rate from DynamicClass: "+rate);
    }

    public static void main(String[] args) {

    }
}
