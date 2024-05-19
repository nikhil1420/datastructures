package com.slidingwindow;

import java.util.Scanner;

public class SumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");
        for (int j = k; j <n;j++){
            sum = sum + arr[j] - arr[j-k];
            System.out.println(sum + " ");
        }
    }
}

//Input:
//6
//3
//1,2,3,4,-2,6
//Output:
//6,9,5,8