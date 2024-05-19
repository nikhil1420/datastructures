package com.hashing;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int A[] = {1,1,2,2,3,3,4,4,5,5};
        System.out.println(longestConsecutive(A));

    }
    public static int longestConsecutive(final int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int count=1;
        int prev = A[0];
        int maxLength = 0;
        for(int i=1;i<A.length;i++){
            if(A[i]==prev)
                continue;
            if(A[i] - prev ==1){
                count++;
                prev = A[i];

            } else
            {

                prev= A[i];
                count=1;
            }
            maxLength= Math.max(maxLength,count);

        }
        return maxLength;
    }
}
