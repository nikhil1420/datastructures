package com.subarrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(subarraySum(arr));
    }
    public static long subarraySum(int[] A) {
        int n = A.length;
        int[] pf = new int[n];
        pf[0] = A[0];
        for(int i=1;i<n;i++){
            pf[i] = pf[i-1]+A[i];
        }
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=0)
                sum+=pf[j]-pf[i-1];
                else
                    sum+=pf[j];
            }
        }
        return sum;
    }
}
