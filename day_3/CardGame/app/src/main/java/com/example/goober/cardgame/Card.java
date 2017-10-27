package com.example.goober.cardgame;

import static android.R.attr.value;

/**
 * Created by goober on 26/10/2017.
 */

public class Card {

    CardType value;
    Suits suit;

    public Card(Suits suit, CardType value) {
        this.value = value;
        this.suit = suit;
    }

    public CardType getCardValue() {
        return value;
    }

    public Suits getSuit() {
        return suit;
    }
}
