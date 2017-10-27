package com.example.goober.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 27/10/2017.
 */

public class TestShop {

    Shop shop;
    Saxophone sax;
    Rosin rosin;
    Microphone mic;
    GuitarStrings guitarStrings;
    Guitar guitar;



    @Before
    public void setup(){
        shop = new Shop("Steve's Music Exchange");
        sax = new Saxophone(Colour.GOLD, Material.BRASS, Family.WOODWIND, "Barotone", 100, 300);
        rosin = new Rosin("Pirastro", 5, 25);
        mic = new Microphone("Shure", "KSM8", 200, 480);
        guitarStrings = new GuitarStrings("Fender Bullets", 3, 6);
        guitar = new Guitar(Colour.WHITE, Material.ALDER, Family.STRINGS, "Fender Stratocaster", 400, 800, 6);

    }

    @Test
    public void canAddStock(){
        shop.addStock(sax);
        shop.addStock(rosin);
        shop.addStock(mic);
        shop.addStock(guitarStrings);
        shop.addStock(guitar);

        assertEquals(5, shop.stock.size());
        assertEquals( 903, shop.getProjectedProfit());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(sax);
        shop.addStock(rosin);
        shop.addStock(mic);
        shop.addStock(guitarStrings);
        shop.addStock(guitar);
        shop.removeStock(mic);

        assertEquals(4, shop.stock.size());
        assertEquals( 623, shop.getProjectedProfit());
    }

}
