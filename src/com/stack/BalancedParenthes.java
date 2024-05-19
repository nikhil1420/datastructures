package com.stack;

import java.util.Stack;

public class BalancedParenthes {
    public static void main(String[] args) {
        String str = ")))))))";
        int ans =solve(str);
        System.out.println(ans);
    }
        public static int solve(String A) {
            Stack<Character> st = new Stack<>();
            int count = 0;
            for(int i=0;i<A.length();i++){
                char x = A.charAt(i);
                if(x=='(' || x=='{' || x=='['){
                    st.push(x);
                    count++;
                }
                else if(!st.empty()){
                    if(((st.peek()=='(' && x==')') || (st.peek()=='{' && x=='}') || (st.peek()=='[' && x==']'))) {
                        st.pop();
                        count--;
                    }
                }
            }
            if(count == 0 && st.empty())
                return 1;
            return 0;
        }
    }

