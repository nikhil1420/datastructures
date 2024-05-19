package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

class Solutions {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] buildArray(int[] nums) {
        for(int i : nums)
            System.out.println(i);
        return nums;
    }
}
