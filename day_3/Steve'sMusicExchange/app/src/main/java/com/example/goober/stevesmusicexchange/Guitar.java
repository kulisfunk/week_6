package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Guitar extends Instrument implements Playable {

    public Guitar(Colour colour, Material material, Family family, String type) {
        super(colour, material, family, type);
    }


    public String instrumentPlay() {
        return "Wacka Wacka Waaaaaa";
    }


}
