package com.hashing;

import java.util.HashMap;

public class FindBinaryEqual {
    public static void main(String[] args) {
        int arr[] ={0,0,1,0,0,0,1,1};
        int ans = findMaxLength(arr);
        System.out.println(ans);
    }

    public static int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int sum = 0;

        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
                sum+=-1;
            else if (nums[i]==1)
                sum+=1;
            if (map.containsKey(sum)) {
                result = Math.max(result, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return result;

    }
}
