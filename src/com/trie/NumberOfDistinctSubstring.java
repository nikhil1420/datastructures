package com.trie;

public class NumberOfDistinctSubstring {
    static class Node {
        Tries.Node children[] = new Tries.Node[26];
        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Tries.Node root = new Tries.Node();

    static int countDistinctSubstring(String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            Tries.Node curr = root;
            for (int j = i; j < word.length(); j++) {
                int idx = word.charAt(i) - 'a';
                if (curr.children[idx] == null) {
                    cnt++;
                    curr.children[idx] = new Tries.Node();
                }
                curr = curr.children[idx];
            }
        }
        return cnt+1;
    }

    public static void main(String args[]) {
        System.out.println(countDistinctSubstring("abab"));
    }
}

