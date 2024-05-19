package com.hashing;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {3,5,2,7,10,8,20,6};
        HashSet<Integer> hs = new HashSet<>();
        int target =12;
        for(int x: arr ){
            int A = x;
            int B = target-A;
            if(hs.contains(B)){
                System.out.println(A+" "+B);
            }
            else
                hs.add(A);
        }
    }
}
