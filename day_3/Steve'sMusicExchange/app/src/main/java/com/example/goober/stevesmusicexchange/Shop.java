package com.example.goober.stevesmusicexchange;

import java.util.ArrayList;

/**
 * Created by goober on 27/10/2017.
 */

public class Shop {

    String name;
    ArrayList<Sellable> stock;
    int projectedProfit;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList();
        projectedProfit = 0;
    }

    public String getName() {
        return name;
    }

    public int getProjectedProfit() {
        return projectedProfit;
    }

    public void addStock(Sellable item){

        stock.add(item);
        projectedProfit += item.calculateMarkup();

    }

    public void removeStock(Sellable item){

        if (stock.contains(item)) {
            projectedProfit -= item.calculateMarkup();
            stock.remove(item);

        }

    }
}
