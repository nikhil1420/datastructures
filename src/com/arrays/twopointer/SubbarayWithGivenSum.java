package com.arrays.twopointer;

public class SubbarayWithGivenSum {
    public static void main(String[] args) {
        int sum=0;
        int[] arr ={1,2,3,4,5};
        int B=5;
        int maxi= Integer.MIN_VALUE;
        int s=0,e=1;
        //int index = -1;
        while (e<arr.length){
            sum+=arr[e]+arr[s];
            if(sum ==B){
                System.out.println(s + " " + e);
                return;
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
