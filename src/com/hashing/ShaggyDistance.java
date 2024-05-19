package com.hashing;

import java.util.HashMap;

public class ShaggyDistance {
    public static void main(String[] args) {
        int []A = {7, 1, 3, 4, 1, 7};
        int result= A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                result = Math.min(hm.get(A[i]) - i, result);
            }
            else{
                hm.put(A[i],i);
            }
        }
        System.out.println(result);;
    }
    }

