package com.multiarrays;

import java.util.Scanner;

public class SpiralTraversal {
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
        int minr=0;
        int minc =0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int cnt =0;
        int total = r*c;
        while (cnt < total){
            for(int i=minr ; i<=maxr && cnt< total;i++){
                System.out.println(arr[i][minc]);
                cnt++;
            }
            minc++;
            for(int i=minc ; i<=maxc && cnt< total;i++){
                System.out.println(arr[maxr][i]);
                cnt++;
            }
            maxr--;
            for(int i=maxr ; i>=minr && cnt< total;i--){
                System.out.println(arr[i][maxc]);
                cnt++;
            }
            maxc--;
            for(int i=minc ; i>=minc && cnt< total;i--){
                System.out.println(arr[minr][i]);
                cnt++;
            }
            minr++;
        }
    }
}
