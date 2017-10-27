package com.example.goober.snap;

import java.util.ArrayList;

/**
 * Created by goober on 27/10/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void takeCard(Card card){
        this.cards.add(card);
    }

    public Card playCard(){
        return cards.remove(0);
    }
}
