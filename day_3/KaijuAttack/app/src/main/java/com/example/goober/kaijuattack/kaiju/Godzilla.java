package com.example.goober.kaijuattack.kaiju;

import com.example.goober.kaijuattack.behaviours.Attack;
import com.example.goober.kaijuattack.behaviours.Move;
import com.example.goober.kaijuattack.vehicles.Tank;


/**
 * Created by goober on 25/10/2017.
 */

public class Godzilla extends Kaiju implements Move, Attack {

    int damage;
    int health;
    String name;
    int swipe;
    int eat;

    public Godzilla(String name, int swipeDamage, int eatDamage, int health) {
        super(name, health);

        this.swipe = swipeDamage;
        this.eat = eatDamage;

    }



    public int attack(String attackMethod) {

        if (attackMethod.equals("swipe")) {
            return this.swipe;
        } else {
            return this.eat;
        }
    }

    public String move() {return this.name + " is Moving forward to Tank ";}



    public String roar() {
        return "Roaaaarrrrr!!!!!";
    }

    public void underAttack(int damage){
        this.health -= damage;
    }

}
