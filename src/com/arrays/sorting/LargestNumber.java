package com.arrays.sorting;

import java.util.Arrays;
import java.util.Comparator;

class FindBiggestNumber implements Comparator<Integer> {
    @Override
    public int compare(Integer val1, Integer val2) {
        String v1 = Long.toString(val1);
        String v2 = Long.toString(val2);
        if (Long.parseLong(v1 + v2) < Long.parseLong(v2 + v1)) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class LargestNumber {

    public static void main(String[] args) {
        int arr[] = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(final int[] A) {
        Integer[] arr = new Integer[A.length];
        int checkZero = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                checkZero++;
            }
            arr[i] = A[i];
        }
        if(checkZero == A.length) {
            return "0";
        }
        Arrays.sort(arr,  new FindBiggestNumber());
        System.out.println(Arrays.toString(arr));
        String str = "";
        for(int i = 0; i < A.length; i++) {
            str = str + arr[i];
        }
        return str;
    }
}
