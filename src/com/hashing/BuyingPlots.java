package com.hashing;

import java.util.HashMap;
//Advanced1
public class BuyingPlots {
    public static void main(String[] args) {
        int[] plots  = {3,5,3,7,4,5,1,6};
        int k=19;

        //build prefix sum
        int n = plots.length;
        int prefix[] = new int[n];
        prefix[0] = plots[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + plots[i];
        }
        // 3,8,11,18,22,27,28,33
        int minLength = Integer.MAX_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int j=0;j<n;j++){
            if(k==prefix[j]){
                minLength = Math.min(minLength,j+1);
            }
            else {
                if(hm.containsKey(prefix[j]-k)){
                    int i = hm.get(prefix[j]-k);
                    minLength = Math.min(minLength, j-i);

                }else {
                    hm.put(prefix[j], j );
                }
            }
        }
        System.out.println(minLength);

    }
}
