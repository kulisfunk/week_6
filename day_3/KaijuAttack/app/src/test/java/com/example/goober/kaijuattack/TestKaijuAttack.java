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
//
//    @Test
//    public void canFlyBroomstick(){
//        assertEquals(wizard2.fly(), "mounting broom, running, skipping, flying!");
//    }
//
//    @Test
//    public void canFlyDragon(){
//        assertEquals(wizard.fly(), "Standing up tall, beating wings, lift off!");
//    }
//
//    @Test
//    public void canFlyMagicCarpet(){
//        assertEquals(wizard3.fly(), "Hovering up, straightening out, flying off!");
//    }
//
//    @Test
//    public void canSetRide(){
//        wizard.setRide(broomstick);
//        assertEquals(wizard.fly(), "mounting broom, running, skipping, flying!");
//    }
//
//    @Test
//    public void hasDragonProtection(){
//        Dragon dragon = (Dragon) wizard.getShield();
//        assertEquals(wizard.protect(), 50);
//
//    }
//
//    @Test
//    public void hasOgreProtection(){
//        Ogre ogre = (Ogre) wizard2.getShield();
//        assertEquals(wizard2.protect(), 70);
//    }
//
//    @Test
//    public void canSetShield(){
//        wizard.setShield(ogre);
//        assertEquals(wizard.protect(), 70);
//    }
}
