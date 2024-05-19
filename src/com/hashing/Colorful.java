package com.hashing;

import java.util.HashSet;

public class Colorful {
    public static void main(String[] args) {
        System.out.println(colorful(3245));

    }
    static public int colorful(int A) {
        HashSet<Integer> set=new HashSet<>();
        while(A>0){
            int temp=A;
            int product=1;
            while(temp>0){
                product*=temp%10;
                if(!set.add(product)) return 0;
                set.add(product);
                temp/=10;
            }
            A/=10;
        }
        return 1;
    }
}
