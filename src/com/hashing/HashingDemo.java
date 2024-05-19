package com.hashing;

import java.util.HashMap;

public class HashingDemo {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("burger",150);
        hm.put("pizza", 200);
        hm.put("noodles", 250);
        //search
        if(hm.containsKey("burger"))
            System.out.println(hm.get("burger"));
        //update
        hm.put("noodles", 254);
        System.out.println(hm.get("noodles"));
        hm.put("burger1", hm.getOrDefault("burger1",150)+10);
        //System.out.println(hm.toString());

        //iterate over all key pair in hm
        for(String key : hm.keySet()){
            System.out.println(key+" " + hm.get(key));
        }
    }
}
