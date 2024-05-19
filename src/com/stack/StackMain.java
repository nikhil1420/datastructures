package com.stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack customStack = new DynamicStack(5);
        customStack.push(11);
        customStack.push(22);
        customStack.push(33);
        customStack.push(44);
        customStack.push(55);
        customStack.push(66);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());


    }
}
