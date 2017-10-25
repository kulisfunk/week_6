package com.example.goober.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by goober on 25/10/2017.
 */

public class Countries {

    public static void main(String[] args) {
        HashMap<String, Integer> countryPops = new HashMap<String, Integer>();

        countryPops.put("UK", 64100000);
        countryPops.put("Germany", 80620000);
        countryPops.put("France", 66030000);
        countryPops.put("Japan", 127300000);


        int ukPop = countryPops.get("UK");
        int germanyPop = countryPops.get("Germany");
        int francePop = countryPops.get("France");
        int japanPop = countryPops.get("Japan");

        System.out.println("UK population is " + ukPop);

        System.out.println("Germany population is " + germanyPop);

        System.out.println("France population is " + francePop);

        System.out.println("Japan population is " + japanPop);

        System.out.println(countryPops.values());

        System.out.println(countryPops.keySet());

        System.out.println(countryPops.entrySet());

        Set<String> key = countryPops.keySet();
        for (String country : key);



    }



}
