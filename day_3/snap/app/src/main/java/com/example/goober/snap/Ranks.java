package com.example.goober.snap;

/**
 * Created by goober on 27/10/2017.
 */

public enum Ranks {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int value;

    Ranks(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
