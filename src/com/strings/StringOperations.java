package com.strings;

//Problem Description
//        Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
//
//        Concatenate the string with itself.
//        Delete all the uppercase letters.
//        Replace each vowel with '#'.
//        You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
//
//        NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
public class StringOperations {
    public static void main(String[] args) {
        String str ="hgUe";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(isVowel(ch)){
                sb.setCharAt(i,'#');
            }
            if(Character.isUpperCase(ch)){
                //sb.delete(i,i+1);
            }
        }
        System.out.println(sb.toString());
        //return sb.toString();
    }

    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
