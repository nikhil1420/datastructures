package com.multiarrays;

import java.util.Scanner;

public class RowSum {
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
        for(int i=0;i<arr.length;i++){
            int ans=0;
            for (int j = 0; j < arr[i].length; j++) {
                ans=ans+arr[i][j];
            }
            System.out.println(ans);
    }
    }
}
