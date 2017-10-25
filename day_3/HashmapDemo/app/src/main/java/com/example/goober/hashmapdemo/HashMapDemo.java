package com.example.goober.hashmapdemo;

import java.util.HashMap;

/**
 * Created by goober on 25/10/2017.
 */

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>(); //define key type and object type (String, String)

        favouriteFruits.put("Michael", "Strawberry");
        favouriteFruits.put("John", "Pineapple");
        favouriteFruits.put("Ally", "Apple");

        System.out.println(favouriteFruits.get("Michael"));

        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Ally", 38);
        ages.put("Alan", 36);

        int allyAge = ages.get("Ally");
        System.out.println("Ally's age is " + allyAge);

//        ages.clear();

        System.out.println(ages.containsValue(45));

        System.out.println(ages.values());

        System.out.println(ages.hashCode());

        System.out.println(ages.size());
    }
}
