package com.example.goober.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 26/10/2017.
 */

public class CardGameTest {


    CardGame game;
    CardPack deck;
    Card card1;


    @Before
    public void before(){

        deck = new CardPack();

        card1 = new Card(Suits.CLUBS, CardType.ACE);
    }

    @Test
    public void getDeckSize(){
        assertEquals(52, deck.cardArray.size());
    }

    @Test
    public void getCard(){
        assertEquals(card1, deck.dealCard());
    }





}
