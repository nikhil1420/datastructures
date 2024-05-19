package com.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Nintegers {
    public static void main(String[] args) {
        int n =6;
        System.out.println(solve(n));
    }
        public static ArrayList<Integer> solve(int A) {

            Queue<String> q =new LinkedList<>();
            q.add("1");
            q.add("2");
            q.add("3");
            ArrayList<Integer> result = new ArrayList<>();
            for( int i=1 ; i <= A ;i++) {
                String ele=q.peek();
                q.offer(ele + "1");
                q.offer(ele + "2");
                q.offer(ele + "3");
                result.add(Integer.parseInt( q.poll()));
            }
            return result;
        }

}
