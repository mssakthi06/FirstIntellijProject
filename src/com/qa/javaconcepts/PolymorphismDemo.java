package com.qa.javaconcepts;

class Animals {
    void sounds() {
        System.out.println("From Animals Class");
    }
}

class PolymorphismDemo extends Animals {
    void sounds() {
        System.out.println("Dynamic Binding From Child Class ");
    }

    void oneStrings(String one) {
        System.out.println("Printing One String " + one);
    }

    void oneStrings(String one, String two) {
        System.out.println("Printing Two Strings " + one + " " + two);
    }

    public static void main(String[] args) {
        Animals animals = new PolymorphismDemo();
        animals.sounds();
        PolymorphismDemo polymorphismDemo = new PolymorphismDemo();
        System.out.println("Method Overloading");
        polymorphismDemo.oneStrings("Kungumakkaliamman");
        polymorphismDemo.oneStrings("Easwara","Muruga");
    }
}
