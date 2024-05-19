package com.trie;

public class Tries1 {

    static class Node {
        Node children[] = new Node[26];
        int cntEndWith =0;
        int cntPrefix = 0;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();

            }
            curr = curr.children[idx];
            curr.cntPrefix++;
        }
        curr.cntEndWith++;
    }

    static int countWordsEqualTo(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] != null) {
                curr = curr.children[idx];
            } else {
                return 0;
            }
        }
        return curr.cntEndWith;
    }

    static int countWordsStartWith(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] != null) {
                curr = curr.children[idx];
            } else {
                return 0;
            }
        }
        return curr.cntPrefix;
    }

    static void erase(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] != null) {
                curr = curr.children[idx];
                curr.cntPrefix--;
            } else {
                return ;
            }
        }
        curr.cntEndWith--;
    }

    public static void main(String args[]) {
        String words[] = {"apple", "apple", "apps", "apps"};
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }



        System.out.println("apps -> " + countWordsEqualTo("apps"));
        System.out.println("abc -> " + countWordsEqualTo("abc"));

        System.out.println("app -> " + countWordsStartWith("app"));
        System.out.println("appl -> " + countWordsStartWith("appl"));


//        System.out.println(erase("abc"));
//        System.out.println(erase("thi"));

    }
}
