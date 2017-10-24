package com.example.goober.bear;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 24/10/2017.
 */

public class BearTest {
    Bear bear;
    Salmon salmon;

    @Before
    public void before() {
        bear = new Bear("Baloo");
        salmon = new Salmon();
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void bellyStartsOffEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        bear.eat(salmon);
        assertEquals(2, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyWhenAsleep(){
        bear.eat(salmon);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }
}
