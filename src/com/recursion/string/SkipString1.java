package com.recursion.string;

public class SkipString1 {
    public static void main(String[] args) {
        skipString("", "baccad");
        System.out.println(skipStringB("baccad"));
    }

    static void skipString(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch =='a'){
            skipString(p,up.substring(1));
        }
        else {
            skipString(p + ch ,up.substring(1));
        }
    }

    static String skipStringB(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch =='a'){
            return skipStringB(up.substring(1));
        }
        else {
            return ch + skipStringB(up.substring(1));
        }
    }
}
