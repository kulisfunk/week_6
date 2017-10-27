package com.example.goober.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestPiano {

    Piano piano;


    @Before
    public void setUp() throws Exception {

        piano = new Piano(Colour.BLACK, Material.MAPLE, Family.KEYBOARD, "Grand Piano");

    }

    @Test
    public void hasColour() throws Exception {
        assertEquals(Colour.BLACK, piano.getColour());
    }

    @Test
    public void hasPianoType(){
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.MAPLE, piano.getMaterial());
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.KEYBOARD, piano.getFamily());
    }

    @Test
    public void isPlayable(){
        assertEquals("tinkle tinkle tink tink", piano.instrumentPlay());
    }



}
