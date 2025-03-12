package com.qa.javaconcepts;

abstract class Bank {
    void bankofInterest() {
        System.out.println("RBI Interest 9%");
    }
}

public class AbstractionDemo extends Bank {
    @Override
    void bankofInterest() {
        System.out.println("Child Class Bank Interest 7.5%");
    }

    public static void main(String[] args) {
        AbstractionDemo abstractionDemo = new AbstractionDemo();
        abstractionDemo.bankofInterest();
    }
}
