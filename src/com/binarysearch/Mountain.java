package com.binarysearch;

public class Mountain {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]) {
                //you are in desc part of array
                //this may be the ans but look at left
                end = mid;
            }
            else
                start= mid+1;
        }
        return start;
    }
}
