package com.example.goober.bear;

import java.util.ArrayList;

/**
 * Created by goober on 24/10/2017.
 */

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;
    private ArrayList<Integer> counter;

    public Bear(String name){
        this.name = name;
        this.belly = new ArrayList<Salmon>();
        this.counter = new ArrayList<Integer>();)
    }
    public String getName(){
        return this.name;
    }

    public int foodCount(){
//        int count = 0;
//        for (Salmon salmon : this.belly){
//            if (salmon != null){
//                count++;
//            }
//        }
//        return count;
        return belly.size();
    }

    public void eat(Salmon salmon){
//        if(!isBellyFull()){
//            int foodCount = foodCount();
//            this.belly[foodCount] = salmon;
          belly.add(salmon);
//        }
    }



    public void sleep(){
//        for(int i=0; i < this.belly.length; i++){
//            this.belly[i] = null;
//
          belly.clear();
    }
}
