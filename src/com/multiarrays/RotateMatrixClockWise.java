package com.multiarrays;

import java.util.Scanner;

public class RotateMatrixClockWise {
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
        // transpose
            for(int i=0;i< arr.length;i++){
                for (int j=i;j<arr[0].length;j++){
                    int t = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = t;
                }
            }

        for(int i=0;i<arr.length;i++){
            int leftindx=0;
            int rightindx=arr[i].length-1;
            while(leftindx<rightindx){
                int temp =arr[i][leftindx];
                arr[i][leftindx]=arr[i][rightindx];
                arr[i][rightindx]=temp;
                leftindx++;
                rightindx--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
