package com.stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {

    }
        static int sortStack (Stack < Integer > st) {
            if (st.empty())
                return 0;
            int temp = st.pop();
            sortStack(st);

            sorted_stack(st, temp);
return 0;
        }
        static int sorted_stack (Stack < Integer > st ,int k){
            if (st.empty() || st.peek() > k) {
                st.push(k);
                return 0;
            }
            int temp = st.peek();
            st.pop();
            sorted_stack(st, k);
            st.push(temp);
            return 0;
        }

}


