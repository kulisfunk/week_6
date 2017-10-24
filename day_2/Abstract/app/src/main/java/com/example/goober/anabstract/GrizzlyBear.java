package com.example.goober.anabstract;

/**
 * Created by goober on 24/10/2017.
 */

public class GrizzlyBear extends Bear {



    public String gatherFood(){
        return super.gatherFood() + " in the river";
    }

    public String hibernate(){
        return "Looking for a nice scratcher";
    }
}
