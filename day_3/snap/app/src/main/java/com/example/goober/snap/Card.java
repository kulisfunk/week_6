package com.example.goober.snap;

/**
 * Created by goober on 27/10/2017.
 */

public class Card {

    Suits suit;
    Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }
}
