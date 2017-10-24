package com.example.goober.iheritance;

/**
 * Created by goober on 24/10/2017.
 */

public class Car extends Vehicle {

    public Car(int numwheels){ //means we can have numwheels changed in vehicle and doesn't affect us
        super(numwheels); //super looks back through class links til it finds the method, in this case in vehicle
    }

    public String startEngine(){
//        return "Vrrrm! I'm a car"; //overrides startEngine method inherited from Vehicle....
        return super.startEngine() + "! I'm a car"; //returns Vehicle string from method then we add extra on.
    }


}
