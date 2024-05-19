package com.arrays.twopointer;

import java.util.Arrays;

public class MaxArea {
    public static void main(String[] args) {
        int[] A = {1, 5, 4, 3};
        if(A.length == 1)
            return ;
        Arrays.sort(A);
        int i=0;
        int j =A.length-1;
        int maxDistance = Integer.MIN_VALUE;
        while(i<j-1){
            int diff = A[j]-A[i];
            int minValue = Math.min(A[j],A[i]);
            maxDistance = Math.max(maxDistance, minValue*diff);
            i++;
        }
        System.out.println(maxDistance);
    }
}
