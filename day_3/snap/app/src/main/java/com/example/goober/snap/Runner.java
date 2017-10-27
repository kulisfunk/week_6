package com.example.goober.snap;

/**
 * Created by goober on 27/10/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player = new Player("Martin");
        Dealer dealer = new Dealer("Dealer", deck);
        Game game = new Game(player, dealer, deck);
        System.out.println(game.start());

    }

}
