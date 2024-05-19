package com.recursion;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> al = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        System.out.println(search(arr,2,0));
        System.out.println(findIndex(arr,2,0));
        findAllIndex(arr,4,0);
        System.out.println(al);
    }


    private static void findAllIndex(int[] arr, int target, int index) {
        if(arr.length-1 == index)
            return;
        if (arr[index]==target)
            al.add(index);
        findAllIndex(arr, target,index+1);
    }

    private static int findIndex(int[] arr, int target, int index) {
        if(arr.length-1 == index)
            return -1;
        if (arr[index]==target)
            return index;
        return findIndex(arr, target,index+1);
    }

    private static boolean search(int[] arr,int target, int index) {
        if(arr.length-1 == index)
            return false;
        return arr[index]==target || search(arr, target,index+1);
    }
}
