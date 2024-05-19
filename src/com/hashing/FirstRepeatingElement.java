package com.hashing;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Integer[] arr={4,1,2,3,4,1,5};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer i : arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(Integer x:arr){
            int value = hm.get(x);
            if(value>=1){
                System.out.println(x);
                break;
            }
        }
    }
}
