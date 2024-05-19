package com.recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
