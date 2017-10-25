package com.example.goober.kaijuattack;

import com.example.goober.kaijuattack.kaiju.Godzilla;
import com.example.goober.kaijuattack.kaiju.Mozilla;
import com.example.goober.kaijuattack.vehicles.Jeep;
import com.example.goober.kaijuattack.vehicles.Tank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 25/10/2017.
 */

public class TestKaijuAttack {

    Godzilla monster1;
    Mozilla monster2;
    Tank tank1;
    Jeep jeep1;

    @Before
    public void before(){

        monster1 = new Godzilla("Gordo", 70, 100, 800);
        monster2 = new Mozilla("Mordo", 70, 90, 600);
        tank1 = new Tank("Heavy Tank", 900, 80, 100);
        jeep1 = new Jeep("Light Jeep", 500, 50, 70);

    }

    @Test
    public void hasName(){
        assertEquals("Gordo", monster1.getName());
        assertEquals("Mordo", monster2.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Heavy Tank", tank1.getType());
        assertEquals("Light Jeep", jeep1.getType());
    }

    @Test
    public void hasRamAttack(){

        assertEquals( 80, tank1.attack("ram"));
        assertEquals( 50, jeep1.attack("ram"));
    }

    @Test
    public void hasShootAttack(){

        assertEquals( 100, tank1.attack("shoot"));
        assertEquals( 70, jeep1.attack("shoot"));
    }

    @Test
    public void hasSwipeAttack(){

        assertEquals( 70, monster1.attack("swipe"));
        assertEquals( 70, monster2.attack("swipe"));
    }

    @Test
    public void hasEatAttack(){

        assertEquals( 100, monster1.attack("eat"));
        assertEquals( 90, monster2.attack("eat"));
    }

    @Test
    public void canGetHealth(){
        assertEquals( 800, monster1.getHealth());
        assertEquals( 600, monster2.getHealth());
        assertEquals( 900, tank1.getHealth());
        assertEquals( 500, jeep1.getHealth());
    }

    @Test
    public void canTakeDamage(){
        monster1.underAttack(tank1.attack("ram"));
        monster2.underAttack(tank1.attack("ram"));
        tank1.underAttack(monster1.attack("swipe"));
        jeep1.underAttack(monster1.attack("swipe"));
        assertEquals( 720, monster1.getHealth());
        assertEquals( 520, monster2.getHealth());
        assertEquals( 830, tank1.getHealth());
        assertEquals( 430, jeep1.getHealth());
    }

    @Test
    public void canRoar(){
        assertEquals(monster1.roar(), "Roaaaarrrrr!!!!!");
        assertEquals(monster2.roar(), "Wheeeaaaaahhh!!!");
    }

    @Test
    public void canMove(){
        assertEquals(monster1.move(), "Gordo is Moving forward to Tank");
        assertEquals(monster2.move(), "Mordo is trying to flank the Jeep!");
        assertEquals(tank1.move(), "Heavy Tank is moving behind a building");
        assertEquals(jeep1.move(), "Light Jeep is moving in for the kill on Mozilla!");
    }

    
}
