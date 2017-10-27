package com.example.goober.snap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(Suits.CLUBS, Ranks.FOUR);
    }

    @Test
    public void hasValue(){
        assertEquals(4, card.getValue());
    }
}
