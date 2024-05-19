package com.strings;

import java.util.Arrays;

public class SortCharacters {
    public static void main(String[] args) {
        char[] chr = {'b', 'd', 'd', 'b', 'a', 'c', 'z'};
        int[] count = new int[26];
        StringBuilder s = new StringBuilder();
        buildCountArray(count, chr, chr.length - 1);
        System.out.println(sortCharacter(count, s));
    }

    private static StringBuilder sortCharacter(int[] count, StringBuilder str) {
        int k = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                char ch = (char) (i + 'a');
                str.append(ch);
                k++;
            }
        }
        return str;
    }


    private static void buildCountArray(int[] count, char[] input, int n) {
        int i;
        for (i = 0; i < n; i++) {
            //char ch = input.charAt(i);

            count[input[i] - 'a']++;


        }
        System.out.println(Arrays.toString(count));
    }
}
