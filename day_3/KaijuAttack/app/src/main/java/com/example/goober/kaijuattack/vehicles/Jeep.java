package com.example.goober.kaijuattack.vehicles;

import com.example.goober.kaijuattack.behaviours.Attack;
import com.example.goober.kaijuattack.behaviours.Move;

/**
 * Created by goober on 25/10/2017.
 */

public class Jeep extends Vehicle implements Attack, Move {

    int health;
    int damage;
    String type;
    int ram;
    int shoot;



    public Jeep(String type, int health,  int ram, int shoot) {
        super(type, health);

        this.ram = ram;
        this.shoot = shoot;

    }

    public int attack(String attackMethod) {

        if (attackMethod.equals("ram")) {
            return this.ram;
        } else {
            return this.shoot;
        }
    }

    public String move() {return this.type + " is moving in for ";}

    public void underAttack(int damage) {
        this.health -= damage;
    }
}
