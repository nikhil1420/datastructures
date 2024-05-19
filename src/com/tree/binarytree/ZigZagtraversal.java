package com.tree.binarytree;

//Problem Statement: Given the root of a Binary Tree, write a recursive function that returns an array containing the preorder traversal of the tree.
//Input:Binary Tree: 4 2 5 3 -1 7 6 -1 9 -1 -1 8 -1 1
//Output: [4 2 3 9 1 5 7 6 8]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagtraversal {


    public static ArrayList < ArrayList < Integer >> zigzagLevelOrder(Node root) {        // If the current node is NULL
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Queue< Node > queue = new LinkedList< Node >();
        if (root == null) {
            return al;
        }
        queue.add(root);
        boolean flag =true;
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            ArrayList < Integer > subList = new ArrayList < Integer > (levelNum);
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if(flag)
                    subList.add(queue.poll().data);
                else
                    subList.add(0,queue.poll().data);
            }
            flag=!flag;
            al.add(subList);
        }
        return al;
    }

    public static void main(String[] args) {
        int i, j;
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        ArrayList < ArrayList < Integer >> ans;
        ans = zigzagLevelOrder(root);
        System.out.println("Zig Zag Traversal of Binary Tree ");
        for (i = 0; i < ans.size(); i++) {
            for (j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}