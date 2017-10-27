package com.example.goober.snap;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by goober on 27/10/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        generateDeck();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void generateDeck(){
        for (Suits suit : Suits.values()){
            for (Ranks rank : Ranks.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card removeCard(){
        return cards.remove(0); //removes card but also returns the removed card so implicitly it's give card...
    }
}
