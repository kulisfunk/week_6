package com.example.goober.kaijuattack.kaiju;

/**
 * Created by goober on 25/10/2017.
 */

public abstract class Kaiju {

    private String name;
    private int health;

    public Kaiju(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract String roar();

    public String getName() {
        return name;
    }


    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setHealth(int health) {
        this.health = health;
    }
}
