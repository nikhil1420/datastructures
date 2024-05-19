package com.arrays;

public class StockProfit {
    public static void main(String[] args) {
        int arr[] = {2,4,1};
        System.out.println(maxProfit1(arr));
    }
//    public static int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE;
//        int maximumProfit = 0;
//        for(int i=prices.length-1; i>minIdx;i--){
//            if(prices[i]-prices[minIdx] > maximumProfit){
//                maximumProfit = prices[i]-prices[minIdx];
//            }
//        }
//        return maximumProfit;
//    }

    public static int maxProfit1(int[] prices) {
        int maximumProfit = 0;
        int maxPrice =0;
        for(int i = 0;i<prices.length-1;i++){
            maxPrice = 0;
            for(int j=i+1;j<prices.length;j++){
                maxPrice=Math.max(prices[j],maxPrice);
            }
            maximumProfit = Math.max(maximumProfit,maxPrice-prices[i]);
        }
        return maximumProfit;
    }
}





