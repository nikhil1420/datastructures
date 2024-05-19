package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeKadane {

    public static void main(String[] args) {
        int nums[] = {-2,-1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {

        int curSum = 0;
        int maxSum = 0;
        if(nums.length ==1)
            return nums[0];

        int allNegative = checkAllNegative(nums);
        if(allNegative !=0 )
            return allNegative;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            if(curSum < 0){
                curSum=0;
            }
            if(maxSum < curSum)
                maxSum=curSum;
        }
        return maxSum;
    }

    public static int checkAllNegative(int[] arr){
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            min = Math.max(min, arr[i]);
            if(arr[i] > 0)
                return 0;
        }
        return min;
    }
}
