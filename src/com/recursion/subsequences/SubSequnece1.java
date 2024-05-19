package com.recursion.subsequences;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SubSequnece1 {
    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2};
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        //Stack<Integer> result = new Stack<>();
        printSeq1(0, al, result,arr, arr.length);
        System.out.println(result);
    }

    static void printSeq(int index, Stack<Integer> res, int[] arr, int n){
        if(index==n){
            System.out.println(res);
            return;
        }
        res.push(arr[index]);
        printSeq(index+1,res,arr,n);
        res.pop();
        printSeq(index+1,res,arr,n);
    }

    static void printSeq1(int index, ArrayList<Integer> al, List<List<Integer>> result, int[] arr, int n){
        if(index == n){
            System.out.println(al);
            result.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[index]);
        printSeq1(index + 1, al, result, arr, n);
        al.remove(al.size() - 1); // Remove the last element to backtrack
        printSeq1(index + 1, al,result, arr, n);
    }
}
