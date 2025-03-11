package com.qa.javaconcepts;

class Vehicle{
    void vehicleMake(String make){
        System.out.println("Make of the Vehicle: "+make);
    }
    void vehicleModel(String model){
        System.out.println("Model of the Vehicle: "+model);
    }
}
class hyundaiVehicle extends Vehicle {
    void display(){
        System.out.println("Displays the Hyundai Vehicle Information");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        hyundaiVehicle hv=new hyundaiVehicle();
        hv.vehicleMake("Hyundai - 2018");
        hv.vehicleModel("Elantra SE");
        hv.display();
    }


}
