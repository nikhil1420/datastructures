package com.binarysearch;

public class OrderAgnostics {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        int arr1[] = { 55,44,33,22,11};
        System.out.println(orderAgnostics(arr1, 55));
    }

    static int orderAgnostics(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
