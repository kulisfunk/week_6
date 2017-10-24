package com.example.goober.iheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 24/10/2017.
 */

public class CarTest {

    Car car;
    Motorbike bike;

    @Before
    public void before(){
        car = new Car(4);
        bike = new Motorbike(2);
    }

    @Test
    public void testCarHasFourWheels(){
        assertEquals(4, car.getNumwheels());
    }

    @Test
    public void testCarCanStart(){
        assertEquals("Vrrrm! I'm a car", car.startEngine());
    }

    @Test
    public void testBikeHasTwoWheels(){
        assertEquals(2, bike.getNumwheels());
    }
}
