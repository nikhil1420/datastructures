package com.recursion.subsequences;

//Problem Statement: Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target. Each number in candidates may only be used once in the combination.
//
//        Note: The solution set must not contain duplicate combinations.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: candidates = [10,1,2,7,6,1,5], target = 8
//
//        Output:
//        [
//        [1,1,6],
//        [1,2,5],
//        [1,7],
//        [2,6]]
//
//
//        Explanation: These are the unique combinations whose sum is equal to target.
public class CombinationSum2 {

    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        List < List < Integer >> ls = combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for(int i=0;i<ls.size();i++){
            for(int j=0;j<ls.get(i).size();j++){
                System.out.print(ls.get(i).get(j)+ " ");
            }
            System.out.println();
        }

    }
    public static List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList< >();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    private static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
            if(target==0) {
                ans.add(new ArrayList<>(ds));
                return;
            }
        for (int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target)
                break;
            ds.add(arr[i]);
            findCombinations(i+1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size()-1);
            }
    }
}
