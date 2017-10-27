package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {

    int buyPrice;
    int sellPrice;
    int numStrings;


    public Guitar(Colour colour, Material material, Family family, String type, int buyPrice, int sellPrice, int numStrings) {
        super(colour, material, family, type);

        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.numStrings = numStrings;
    }


    public String instrumentPlay() {
        return "Wacka Wacka Waaaaaa";
    }

    public int calculateMarkup() {
        return (sellPrice - buyPrice);
    }

    public int getNumStrings() {
        return numStrings;
    }

}
