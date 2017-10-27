package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Saxophone extends Instrument implements Playable {

    int numKeys;

    public Saxophone(Colour colour, Material material, Family family, String type) {
        super(colour, material, family, type);
    }

    public String instrumentPlay() {
        return "fvoo fvoo fvoooooo";
    }
}