package com.recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(findPower(2,3));
    }

    private static int findPower(int n, int p) {
        if(p ==0)
            return 1;
        return n*findPower(n,p-1);
    }
}
