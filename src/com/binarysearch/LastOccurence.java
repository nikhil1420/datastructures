package com.binarysearch;

public class LastOccurence {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        System.out.println(firstOccurence(arr, 7 ));
    }

    static int firstOccurence(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        int ans =0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                start=mid+1;
            }
            else if(arr[mid] > target)
                end = mid -1;
            else
                start= mid+1;
        }
        return ans;
    }
}
