package com.multiarrays;

import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+= arr[i][arr.length-1-i];
        }
        System.out.println(sum);
    }
}
