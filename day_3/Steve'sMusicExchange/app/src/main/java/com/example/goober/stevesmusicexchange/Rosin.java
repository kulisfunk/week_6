package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Rosin implements Sellable {

    String make;
    int buyPrice;
    int sellPrice;

    public Rosin(String make, int buyPrice, int sellPrice) {
        this.make = make;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return (sellPrice - buyPrice);
    }
}
