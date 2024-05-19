package com.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abebag";
        int palin = isPalindrome(str, 0, str.length()-1);
        System.out.println(palin);
    }

    private static int isPalindrome(String str, int start, int end) {
        if(start>end)
            return 1;
        if(str.charAt(start)!=str.charAt(end))
            return 0;
        return isPalindrome(str, start+1, end-1);
    }
}
