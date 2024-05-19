package com.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayZero {
    public static void main(String[] args) {
        int[] arr={1,2,-2,4,-4};
        System.out.println(lszero(arr).length);
    }
    public static int[] lszero(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxLen = 0;
        int maxL = Integer.MIN_VALUE;
        int maxR = Integer.MAX_VALUE;
        int sum = 0;
        hashMap.put(0, -1);

        for (int i = 0; i < n; i++) {
            sum += A[i];

            if (hashMap.containsKey(sum)) {
                int oldIndex = hashMap.get(sum);
                int len = i - oldIndex;

                if (len > maxLen) {
                    maxLen = len;
                    maxL = oldIndex + 1;
                    maxR = i;
                }
            } else {
                hashMap.put(sum, i);
            }
        }

        if (maxL == Integer.MIN_VALUE) {
            return new int[] {};
        } else {
            return Arrays.copyOfRange(A, maxL, maxR + 1);
        }
    }
}
