package com.codeclan.example.interfaces_startpoint;

/**
 * Created by user on 24/10/2017.
 */

class Salmon implements Edible{
    public String swim() {
        return "I'm swimming!";
    }

    @Override
    public String beGrilled() {
        return "Flippy flap";
    }
}
