package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class MinCostToRemoveAllElements {
    public static void main(String[] args) {
        Integer[] arr =  {2,1,4};
        System.out.println(minCost(arr));
    }

    private static int minCost(Integer[] arr) {
        int min_cost = 0;

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0 ;i< arr.length;i++) {
            min_cost += arr[i]*(i+1);
        }
        return min_cost;
    }

}
