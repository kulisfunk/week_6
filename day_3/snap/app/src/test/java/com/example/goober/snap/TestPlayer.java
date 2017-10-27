package com.example.goober.snap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestPlayer {

    Player player;
    Card card;

    @Before
    public void setup(){
        player = new Player("Martin");
        card = new Card(Suits.HEARTS, Ranks.EIGHT);
    }

    @Test
    public void canTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.getCards().size());
    }

    @Test
    public void canPlayCard(){
        player.takeCard(card);
        Card card = player.playCard();
        assertEquals(Suits.HEARTS, card.getSuit());
        assertEquals(Ranks.EIGHT, card.getRank());
    }
}
