package com.strings;

public class ReverseWord {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Are you as clever as I am");
        StringBuilder revStr = reverse(str,0,str.length()-1);
        System.out.println(revStr);
        StringBuilder result = new StringBuilder();
        int start =0;
        int end = 0;
//        for(end = 0;end<str.length();end++){
//            if(revStr.charAt(end) == ' '){
//                reverse(revStr,start,end-1);
//                start=end+1;
//            }
//        }

        while (start<=end ){
            char ch = revStr.charAt(end);
            if(ch == ' '){
                reverse(revStr,start,end-1);
                end++;
                start = end;
            }
            if(end == str.length()-1){
                reverse(revStr,start,end);
                break;
            }
            else{
                end++;
            }
        }
        //reverse(revStr, start, revStr.length()-1);
        System.out.println(revStr);;
    }
    public static StringBuilder reverse(StringBuilder str, int l,int r){
        while(l<r){
            char temp = str.charAt(l);
            str.setCharAt(l, str.charAt(r));
            str.setCharAt(r, temp);
            l++;
            r--;
        }
        return str;
    }
    }

