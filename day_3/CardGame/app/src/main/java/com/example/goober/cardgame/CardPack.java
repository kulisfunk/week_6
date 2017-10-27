package com.example.goober.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static android.R.id.list;

/**
 * Created by goober on 26/10/2017.
 */

public class CardPack{

    public ArrayList<Card> cardArray;
    int cardCount;
    Card singleCard;



    public CardPack() {

        this.cardArray = new ArrayList<Card>();
        cardCount = 0;
        createDeck();
    }


    public void createDeck() {

        for  (Suits suit : Suits.values()){
            for (CardType value : CardType.values()){
                Card card = new Card(suit, value);
                cardArray.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.cardArray);
    }

    public Card dealCard() {
        if (cardCount <= 51) {
            singleCard = this.cardArray.get(cardCount);
            cardCount++;
            return singleCard;
        }
        shuffleDeck();
        cardCount = 0;
        return null;
    }



}

