package com.example.goober.tddrobot;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.name;
import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 24/10/2017.
 */

public class RobotTest {

    Robot robot;

    @Before
    public void before()  {
        robot = new Robot("C3PO", "Gold");

    }


    @Test
    public void testRobotSetup(){
        assertEquals("C3PO", robot.getName());
        assertEquals("Gold", robot.getColour());
        assertEquals(100.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void testMakeDrink(){
        assertEquals("I am making Tea", robot.makeDrink("Tea"));
        assertEquals(90.0, robot.checkBattery(), 0.1);

    }

    @Test
    public void testWashingDishes(){
        assertEquals("I am washing the dishes", robot.washingDishes());
        assertEquals(70.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void testDoDusting(){
        assertEquals("I am dusting", robot.doDusting());
        assertEquals(80.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void testRechargeBattery(){
        robot.washingDishes();
        assertEquals(100.0, robot.rechargeBattery(), 0.1);
    }
}
