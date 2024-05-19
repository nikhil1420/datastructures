package com.hashing;

//Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
//
//        NOTE:
//
//        Each element in the result should appear as many times as it appears in both arrays.
//        The result can be in any order.
import java.util.HashMap;

public class CommonElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer i : A){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(Integer x:B){
            if(hm.containsKey(x) && hm.get(x)>0){
                {
                    System.out.println(x);
                    hm.put(x,hm.get(x)-1);
                }
            }
        }
    }
}
