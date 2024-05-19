package com.arrays.twopointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, -8};
        int target = 16;
        System.out.println(findPair(arr, target));
    }

    private static boolean findPair(int[] arr, int target) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        int sum = 0;
        while (s < e) {
            if (arr[s] + arr[e] == target) {
                return true;
            } else if (arr[s] + arr[e] > target) {
                e--;
            } else {
                s++;
            }
        }
        return false;
    }
}
