package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int price[] = {100,80,60,70,60,75,85};
        int n = price.length;
        //bruteForce(price);
        uisngStack(price,n);
    }

    private static void bruteForce(int price[], int n) {
        int res[] = new int[n];
        res[0]=1;
        for (int i=1;i<n;i++){
            int count =1;
           for(int j=i;j>=0;j--){
               if(price[i]>price[j-1]){
                   count++;
               }
               else {
                   break;
               }
           }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
    }

    private static void uisngStack(int price[], int n) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int count =0;
        for (int i=1;i<n;i++){
            while (!st.empty() && st.peek()<price[i]){
                count++;
            }
            if (st.empty())
                res.add(1);
            else
                res.add(count+1);
            st.add(price[i]);
        }

        System.out.println(res);
    }
}
//[1,1,1,2,1,4,6]