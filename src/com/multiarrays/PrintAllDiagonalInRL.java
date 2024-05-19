package com.multiarrays;

import java.util.Scanner;

public class PrintAllDiagonalInRL {
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
        for(int i=0;i< arr[0].length;i++) {
            int x = 0;
            int y = i;
            while (x < arr.length && y >= 0) {
                System.out.println(arr[x][y]);
                x++;
                y--;
            }
        }
        for(int i=1;i< arr.length;i++){
            int x=i;
            int y= arr[0].length-1;
            while (x< arr.length && y>=0){
                System.out.println(arr[x][y]);
            x++;
            y--;
        }
        }
    }
}
