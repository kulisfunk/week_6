package com.example.goober.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestSaxophone {

    Saxophone sax;


    @Before
    public void setUp() throws Exception {

        sax = new Saxophone(Colour.GOLD, Material.BRASS, Family.WOODWIND, "Barotone");

    }

    @Test
    public void hasColour() throws Exception {
        assertEquals(Colour.GOLD, sax.getColour());
    }

    @Test
    public void hasPianoType(){
        assertEquals("Barotone", sax.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.BRASS, sax.getMaterial());
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.WOODWIND, sax.getFamily());
    }

    @Test
    public void isPlayable(){
        assertEquals("fvoo fvoo fvoooooo", sax.instrumentPlay());
    }
}
