package com.example.goober.tddrobot;

/**
 * Created by goober on 24/10/2017.
 */

public class Robot {
    private String name;
    private String colour;
    private Double battery;

    public Robot(String name, String colour){
        this.name = name;
        this.colour = colour;
        this.battery = 100.0;
    }

    public String getName(){
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public Double checkBattery() {
        return battery;
    }

    public String makeDrink(String drink){
        reduceBattery(10.0);
        return ("I am making " + drink);
    }

    public String washingDishes(){
        reduceBattery(30.0);
        return "I am washing the dishes";
    }

    public String doDusting(){
        reduceBattery(20.0);
        return "I am dusting";
    }

    public Double rechargeBattery(){
        this.battery = 100.0;
        return this.battery;
    }

    public Double reduceBattery(Double amount){ //a method to reduce battery power instead of repeating code
        return this.battery -= amount;
    }


}
