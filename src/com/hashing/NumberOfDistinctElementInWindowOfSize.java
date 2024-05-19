package com.hashing;

import java.util.HashMap;

public class NumberOfDistinctElementInWindowOfSize {
    public static void main(String[] args) {
        int[] arr={2,4,3,8,3,9,4,9,4,10};
        int k=4;
        HashMap<Integer, Integer> hm = new HashMap<>();
        //Do it for first window
        for(int i=0;i<k;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm.size());
        //Do it for remaining window
        int s =1;
        int e = k;
        while (e < arr.length){
            // outgoing element
            int outgoing = arr[s-1];
            hm.put(outgoing, hm.getOrDefault(outgoing,hm.get(outgoing))-1);
            if(hm.get(outgoing)==0){
                hm.remove(outgoing);
            }
            int incoming = arr[e];
            hm.put(incoming, hm.getOrDefault(incoming,0)+1);
            s++;
            e++;
            System.out.println(hm.size());
        }
    }
}
