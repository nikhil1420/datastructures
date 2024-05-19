package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortArrray {
    public static void main(String[] args) {
        int[] A = {12,7};
        int []B = {7,1,6,17,2,19,10};
        System.out.println(solve(A,B));

    }
    public static int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[A.length];
        for(int i=0;i<A.length;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        System.out.println(hm.toString());
        int count =0;
        for(int i:B) {
            int x = hm.get(i);

            while (x != 0) {
                res[count++] = i;
                hm.put(i, hm.getOrDefault(i, 0) - 1);
          if(hm.get(i)==0)
               hm.remove(i);
                x--;
            }

        }
        for(int i:A){
            if(hm.containsKey(i) && hm.get(i)!=0 && count<res.length) {
                res[count++] = i;
                hm.put(i, hm.getOrDefault(i, 0) - 1);
                if(hm.get(i)==0)
                    hm.remove(i);
            }
        }
        return  res;
    }
}
