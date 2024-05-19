package com.binarysearch;

public class RBS {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static void main(String[] args) {

        int A[] = {1, 7, 67, 133, 178 };
        int B = 202;
        System.out.println(searchInRBS(A, B));
    }

        static int searchInRBS (int[] A, int B){
            int pivot = findPivot(A);
            if (pivot == -1) {
                return search(A, B,0, A.length)-1;
            }
            if (A[pivot] == B)
                return pivot;
            if (A[0] <= B)
                return search(A, B, 0, pivot - 1);
            return search(A, B, pivot + 1, A.length - 1);

        }
    public static int findPivot(int [] arr){
        int start=0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int search(int[] A, int B, int s, int e){
        while(s<=e){
            int m = s + (e-s)/2;
            if(A[m]==B)
                return m;
            if(B>A[m])
                s=m+1;
            else
                e=m-1;
        }
        return -1;
    }

}
