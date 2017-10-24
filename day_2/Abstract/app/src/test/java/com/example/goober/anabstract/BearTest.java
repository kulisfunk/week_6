package com.example.goober.anabstract;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by goober on 24/10/2017.
 */

public class BearTest {

    PolarBear polarBear;
    GrizzlyBear grizzlyBear;


    @Before

    public void before() {

        polarBear = new PolarBear();
        grizzlyBear = new GrizzlyBear();
    }

    @Test

    public void canGatherFood(){
        assertEquals("Gathering food breaking the ice", polarBear.gatherFood());
        assertEquals("Gathering food in the river", grizzlyBear.gatherFood());
    }


}
