package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public class Violin extends Instrument implements Playable{


    public Violin(Colour colour, Material material, Family family, String type) {
        super(colour, material, family, type);

    }

    public String instrumentPlay() {
        return "fiddle fiddle dee fiddle dee dee";
    }






}
