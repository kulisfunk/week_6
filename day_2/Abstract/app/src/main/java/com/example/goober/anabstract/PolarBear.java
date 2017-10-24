package com.example.goober.anabstract;

/**
 * Created by goober on 24/10/2017.
 */

public class PolarBear extends Bear {


    @Override
    public String hibernate() {
        return null; //one of the ways of dealing with an abstract method
    }

    public String gatherFood(){
        return super.gatherFood() + " breaking the ice";
    }
}
