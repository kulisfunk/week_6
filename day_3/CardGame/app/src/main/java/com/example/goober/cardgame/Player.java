package com.example.goober.cardgame;

import java.util.ArrayList;

/**
 * Created by goober on 26/10/2017.
 */

public class Player {

    String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public int getCardValue(){
        return 1;

    }
}
