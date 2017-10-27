package com.example.goober.snap;

/**
 * Created by goober on 27/10/2017.
 */

public class Dealer extends Player {

    Deck deck;

    public Dealer(String name, Deck deck) {

        super(name);
        this.deck = deck;
        shuffle();
    }

    public Card deal() {
        return this.deck.removeCard();
    }

    public void shuffle() {

    this.deck.shuffle();
    }
}
