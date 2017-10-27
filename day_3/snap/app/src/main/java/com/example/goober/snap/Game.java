package com.example.goober.snap;

import java.util.ArrayList;

/**
 * Created by goober on 27/10/2017.
 */

public class Game {

    Player player;
    Dealer dealer;
    Deck deck;
    ArrayList<Card> pile;
    boolean isWon;

    public Game(Player player, Dealer dealer, Deck deck){

        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        this.pile = new ArrayList<>();
        this.isWon = false;

    }

    public String start(){
        while(!deck.getCards().isEmpty()){
            player.takeCard(dealer.deal());
            dealer.takeCard(dealer.deal());
        }
        ArrayList<Player> players = new ArrayList<>();
        players.add(this.dealer);
        players.add(this.player);

        return takeTurns(players);
    }

    public String takeTurns(ArrayList<Player> players){
        while(!this.isWon && this.pile.size() < 52) {
            for (Player player : players) {
                this.pile.add(player.playCard());
                if (checkWin()) {
                    return gameOver(player);
                }
            }
        }
        return "Nobody won, no cards left!";
    }

    public boolean checkWin(){
        if (this.pile.get(this.pile.size()-1).getValue() == this.pile.get(this.pile.size()-2).getValue()) {
                this.isWon = true;
                return true;
            }
        return false;
    }

    public String gameOver(Player player){
        return "Snap! " + player.getName() + " Has won";
    }

}
