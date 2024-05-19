package com.stack;

import java.util.Stack;

public class RedundantBracket {
    public static void main(String[] args) {
        String A = "(a)";
        int res = braces(A);
        System.out.println(res);

    }
        public static int braces(String A) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < A.length(); i++) {
                char x = A.charAt(i);
                if (x == ')') {
                    if (st.peek() == '(') {
                        return 1;
                    } else {
                        while (!st.empty() && st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }
                }
                st.push(x);
            }

            return 0;
        }
    }

    //"((a+b))" 1
//"(a+(a+b))" 0
//(a) 1

