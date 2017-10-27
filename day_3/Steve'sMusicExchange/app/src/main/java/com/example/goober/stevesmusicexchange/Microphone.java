package com.example.goober.stevesmusicexchange;

import static android.os.Build.VERSION_CODES.O;

/**
 * Created by goober on 27/10/2017.
 */

public class Microphone implements  Sellable{

    String make;
    String model;
    int buyPrice;
    int sellPrice;

    public Microphone(String make, String model, int buyPrice, int sellPrice) {
        this.make = make;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public int calculateMarkup() {
        return (sellPrice - buyPrice);
    }
}
