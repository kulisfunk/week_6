package com.example.goober.iheritance;

/**
 * Created by goober on 24/10/2017.
 */

public class Vehicle {
    int numwheels;

    public Vehicle(int numwheels){ //declaration
        this.numwheels = numwheels; //assignment
    }

    public int getNumwheels(){ //getter for numwheels
        return this.numwheels;
    }

    public String startEngine(){
        return "Vrrrm";
    }
}
