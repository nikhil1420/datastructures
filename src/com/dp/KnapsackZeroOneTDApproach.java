package com.dp;

public class KnapsackZeroOneTDApproach {
    public static void main(String[] args)
    {
        int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int W = 50;
        int N = profit.length;

        System.out.println(knapSack(W, weight, profit, N));
    }

    static int knapSack(int W, int wt[], int val[], int N)
    {
        int[][] dp = new int[N+1][W+1];
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < W + 1; j++)
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
        return knapSackRec(W, wt, val, N, dp);
    }

    // Returns the value of maximum profit
    static int knapSackRec(int W, int wt[], int val[],
                           int n, int[][] dp) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if(wt[i-1]<=j){
                    dp[i][j] =Math.max(val[i - 1]
                            + dp[i-1][j-wt[i-1]],
                            dp[i-1][j]);
                }
                    else{
                    dp[i][j] = dp[i-1][j];
                }

    }
}
        return dp[n][W];
    }
}
