package com.example.goober.kaijuattack.vehicles;

/**
 * Created by goober on 25/10/2017.
 */

public abstract class Vehicle {

    private String type;
    private int health;

    public Vehicle(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
