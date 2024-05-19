package com.patterns;

public class Patterns {
    public static void main(String[] args) {
        //pattern5(5);
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    static void pattern2(int n){
        for(int row=1;row<n;row++) {
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row=1;row<n;row++) {
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=0;row<2*n;row++) {
            int totlaColsInRow = row>n ? 2*n-row:row;
            for(int col=0;col<totlaColsInRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=0; row<2*n;row++) {
            int totlaColsInRow = row>n ? 2*n-row:row;
            int noOfSpaces = n-totlaColsInRow;
            for(int s=0;s<noOfSpaces;s++) {
                System.out.print(" ");
            }
            for(int col=0;col<totlaColsInRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int numIdenticalPairs(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
