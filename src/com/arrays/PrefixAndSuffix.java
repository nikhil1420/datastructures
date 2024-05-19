package com.arrays;

import java.util.Arrays;

public class PrefixAndSuffix {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n=arr.length;
        int pf[]= new int[n];
        int sf[]= new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]= pf[i-1]+arr[i];
        }
        sf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]= sf[i+1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(pf));
        System.out.println("-------");
        System.out.println(Arrays.toString(sf));

    }
}
