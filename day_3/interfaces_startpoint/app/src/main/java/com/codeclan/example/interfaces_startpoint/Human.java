package com.codeclan.example.interfaces_startpoint;

/**
 * Created by goober on 25/10/2017.
 */

//public class Human extends Animal implements Edible{ //syntax for class extension and interface implementation

    public class Human implements Edible{

    public String speak(){
        return "Hello how are you?";
    }

    @Override
    public String beGrilled() {
        return "Ouch";
    }
}
