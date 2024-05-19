package com.dp;

public class SubsetSumCount {
    public static void main(String[] args)
    {
        int n = 5;
        int a[] = { 1, 5, 3, 7, 4 };
        int sum = 12;

        int res =  (subsetSum(a, n, sum));
        System.out.println(res);

    }

    static int subsetSum(int arr[], int n, int sum)
    {
        int subset[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    subset[i][j] = 0;
                }
                if (j == 0) {
                    subset[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<=j){
                    subset[i][j] = subset[i-1][j-arr[i-1]] +
                            subset[i-1][j];
                }
                else{
                    subset[i][j] = subset[i-1][j];
                }
            }
        }
        return subset[n][sum];
    }
}
