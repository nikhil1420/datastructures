package com.arrays;

public class ProductPuzzle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(solve(arr));
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int pref[] = new int[n];
        int suf[] = new int[n];
        int res[] = new int[n];
        pref[0] = A[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] * A[i];
        }
        suf[n-1] = A[n-1];
        for(int i = n-2; i>=0;i--){
            suf[i] = suf[i+1] * A[i];
        }
        res[0]=suf[1];
        res[n-1]=pref[n-2];
        for(int i = 1; i<n-1;i++){
            res[i] = pref[i-1] * suf[i+1];
        }
        return res;

    }
}
