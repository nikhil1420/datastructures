package com.slidingwindow;

import java.util.Scanner;

import static java.lang.Math.min;

public class MinSubarrayWhoseSumIsEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int i=0;
        int j=0;
        int minLength = n;
        while (j<n && i<n){
            sum += arr[j];
            if (sum>k) {
                sum -= arr[i];
                i++;
            }
            if (sum<k) {
                j++;
            }
            if (sum==k){
                minLength = min(minLength, j-i+1);
                i++;
            }
        }
        System.out.println(minLength);
    }
}
//10 16 8 2 10 5 1 3 1 7 4 4
