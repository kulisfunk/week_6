package com.example.goober.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestGuitar {

    Guitar guitar;


    @Before
    public void setUp() throws Exception {

        guitar = new Guitar(Colour.WHITE, Material.ALDER, Family.STRINGS, "Fender Stratocaster");

    }

    @Test
    public void hasColour() throws Exception {
        assertEquals(Colour.WHITE, guitar.getColour());
    }

    @Test
    public void hasPianoType(){
        assertEquals("Fender Stratocaster", guitar.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.ALDER, guitar.getMaterial());
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.STRINGS, guitar.getFamily());
    }

    @Test
    public void isPlayable(){
        assertEquals("Wacka Wacka Waaaaaa", guitar.instrumentPlay());
    }
}
