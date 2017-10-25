package com.example.goober.kaijuattack.kaiju;

import com.example.goober.kaijuattack.behaviours.Attack;
import com.example.goober.kaijuattack.behaviours.Move;

/**
 * Created by goober on 25/10/2017.
 */

public class Mozilla extends Kaiju implements Move, Attack {

    int damage;
    int health;
    String name;
    int swipe;
    int eat;

    public Mozilla(String name, int swipeDamage, int eatDamage, int health) {
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

    public String move() {return this.name + " is trying to flank the Jeep!";}


    public String roar() {
        return "Wheeeaaaaahhh!!!";
    }

    public void underAttack(int damage){
        this.health -= damage;
    }
}
