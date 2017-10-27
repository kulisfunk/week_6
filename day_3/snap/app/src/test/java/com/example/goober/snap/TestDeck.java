package com.example.goober.snap;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestDeck {

    Deck deck;
    Deck spyDeck;

    @Before
    public void setup(){
        deck = new Deck();
        spyDeck = Mockito.spy(deck);
    }

    @Test
    public void canGenerateDeck(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canGetCard(){
        Mockito.when(spyDeck.removeCard()).thenReturn(new Card(Suits.HEARTS, Ranks.ACE));
        Card card = spyDeck.removeCard();
        assertEquals(Suits.HEARTS, card.getSuit());
        assertEquals(Ranks.ACE, card.getRank());
    }
}
