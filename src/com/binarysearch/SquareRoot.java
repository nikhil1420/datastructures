package com.binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqRoot(50));
    }

    private static int sqRoot(int n) {
        int start =0;
        int end = n;
        while(start<=end){
            int mid = (start + end)/2;
            if(mid*mid <= n){
                start=mid+1;
            }
            else
                end = mid -1;
        }
        return end;
    }
}
