package com.strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        int l=n/2, r = n/2;
        while(l>=0 && r<n){
            if(str.charAt(l)!= str.charAt(r))
                return false;
            l--;
            r++;
        }
        return true;
    }
}
