package com.slidingwindow.longestsubaarayconditionpattern;

public class SubarrayWithSumLessThanEqualToK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int k=14;
        System.out.println(bruteForce(arr,k));
        System.out.println(betterApproach(arr,k));
    }
    public static int bruteForce(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
                else if(sum>k){
                    break;
                }
            }
        }
        return maxLen;
    }

    public static int betterApproach(int[] arr, int k) {
        int n = arr.length;
        int l=0;
        int r=0;
        int sum=0;
        int maxLen = 0;
        while(r<n){
            sum+=arr[r];

            while (sum>k){
                sum-=arr[l++];
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
