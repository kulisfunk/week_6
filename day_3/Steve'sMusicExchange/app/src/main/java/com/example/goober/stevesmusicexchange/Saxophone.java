package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Saxophone extends Instrument implements Playable, Sellable {


    int buyPrice;
    int sellPrice;



    public Saxophone(Colour colour, Material material, Family family, String type, int buyPrice, int sellPrice) {
        super(colour, material, family, type);

        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String instrumentPlay() {
        return "fvoo fvoo fvoooooo";
    }

    public int calculateMarkup() {
        return (sellPrice - buyPrice);
    }
}