package com.subarrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int sum=0;
        int[] arr ={1,2,3,4,5};
        int B=12;
        int maxi= Integer.MIN_VALUE;
        int s=0,e=0;
        //int index = -1;
        while (e<arr.length){
            //sum+=arr[e]- arr[s-1];

            if(sum<B){
                sum+=arr[e];
                e++;
            }
            if(sum>B){
                sum-=arr[s];
                s++;
            }
            if(sum==B){
                System.out.println(sum);
                s++;
            }
            //System.out.println(sum);

        }
        System.out.println(sum);
    }
}
