//package com.binarysearch;
//
//public class InfiniteArray {
//    public static void main(String[] args) {
//        int arr[] = {11,22,33,44,55};
//        //System.out.println(binarySearch(arr, 66 ));
//    }
//
//    static int ans(int arr[], int target) {
//        //first find the range
//        //first start with box of size 2
//        int start =0;
//        int end =1;
//        while (target>arr[end]){
//            int newStart = end+1;
//            // double the box size
//            // end = previous box + sizeOfBox*2
//            end = end+ (end -start+1)*2;
//            start = newStart;
//        }
//    }
//
//    static int binarySearch(int arr[], int target, int start, int end){
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid] > target)
//                end = mid -1;
//            else if(arr[mid] < target)
//                start= mid+1;
//            else
//                return mid;
//        }
//        return -1;
//    }
//}
