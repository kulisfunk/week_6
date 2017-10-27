package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class GuitarStrings implements Sellable{

    String type;
    int buyPrice;
    int sellPrice;

    public GuitarStrings(String type, int buyPrice, int sellPrice) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return (sellPrice - buyPrice);
    }
}
