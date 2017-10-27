package com.example.goober.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestViolin {

    Violin violin;


    @Before
    public void setUp() throws Exception {

        violin = new Violin(Colour.BROWN, Material.SPRUCE, Family.STRINGS, "Stradivarius");

    }

    @Test
    public void hasColour() throws Exception {
        assertEquals(Colour.BROWN, violin.getColour());
    }

    @Test
    public void hasPianoType(){
        assertEquals("Stradivarius", violin.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.SPRUCE, violin.getMaterial());
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.STRINGS, violin.getFamily());
    }

    @Test
    public void isPlayable(){
        assertEquals("fiddle fiddle dee fiddle dee dee", violin.instrumentPlay());
    }
}
