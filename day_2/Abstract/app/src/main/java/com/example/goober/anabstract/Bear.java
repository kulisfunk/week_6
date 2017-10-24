package com.example.goober.anabstract;

/**
 * Created by goober on 24/10/2017.
 */

public abstract class Bear {

    public abstract String hibernate();

    public String gatherFood(){
        return "Gathering food";
    }

    public String growl(){
        return "Grrrrrr!";
    }
}
