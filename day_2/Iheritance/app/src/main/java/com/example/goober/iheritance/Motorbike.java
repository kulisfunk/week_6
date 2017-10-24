package com.example.goober.iheritance;

/**
 * Created by goober on 24/10/2017.
 */

public class Motorbike extends Vehicle {

//    public Motorbike() { //constructor needed here but not in car because we change number of wheels for bike
//        numwheels = 2;
//    }

    public Motorbike(int numwheels){ //means we can have numwheels changed in vehicle and doesn't affect us
        super(numwheels);
    }
}
