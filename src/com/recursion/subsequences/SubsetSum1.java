package com.recursion.subsequences;

//Problem Statement: Given an array print all the sum of the subset generated from it, in the increasing order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Input: N = 3, arr[] = {5,2,1}
//        Output: 0,1,2,3,5,6,7,8
//        Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8
public class SubsetSum1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> ans = subsetSums(arr, arr.size());
        for(Integer i : ans)
            System.out.println(i+" ");
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0,0,arr,n,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if(ind==N){
          sumSubset.add(sum);
          return;
        }
        subsetSumsHelper(ind+1, sum+arr.get(ind), arr, N, sumSubset);
        subsetSumsHelper(ind+1, sum, arr, N, sumSubset);
    }
    }
