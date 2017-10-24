package com.example.goober.iheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 24/10/2017.
 */

public class MammalTest {

    Mammal mammal;
    Human man;
    Chimp monkey;

    @Before
    public void before(){
        mammal = new Mammal();
        man = new Human();
        monkey = new Chimp();
    }

    @Test
    public void testHumanEats(){
        assertEquals("Munch munch", man.eat());
    }

    @Test
    public void testHumanBreaths(){
        assertEquals("Huff puff", man.breathe());
    }

    @Test
    public void testHumanBrushHair(){
        assertEquals("brush brush", man.brushHair());
    }

    @Test
    public void testHumanSpeak(){
        assertEquals("I say, who the devil are you?", man.speak());
    }

    @Test
    public void testChimpEats(){
        assertEquals("Munch munch", monkey.eat());
    }

    @Test
    public void testChimpBreaths(){
        assertEquals("Huff puff", monkey.breathe());
    }

    @Test
    public void testChimpBrushHair(){
        assertEquals("brush brush", monkey.brushHair());
    }

    @Test
    public void testChimpSpeak(){
        assertEquals("Whoo whoo", monkey.speak());
    }
}
