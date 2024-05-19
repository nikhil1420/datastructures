package com.recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //this is last function call
        //tail recursion
        print(n+1);
    }
}
