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

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    public String makeDrink(String drink){
        this.battery -= 10;
        return ("I am making " + drink);
    }

    public String washingDishes(){
        this.battery -=30;
        return "I am washing the dishes";
    }

    public String doDusting(){
        this.battery -= 20;
        return "I am dusting";
    }

    public Double rechargeBattery(){
        this.battery = 100.0;
        return this.battery;
    }


}
