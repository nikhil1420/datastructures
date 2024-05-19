package com.recursion;

public class NTo1 {
    public static void main(String[] args) {
        //printNto1(5);
        System.out.println("-----------");
        print1toN(5);
    }

    private static void print1toN(int n) {
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }

    private static void printNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}
