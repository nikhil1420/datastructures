package com.tree.binarytree.medium;

// Problem Statement: Given the root of a Binary Tree, return the height of the tree. The height of the tree is equal to the number of nodes on the longest path from root to a leaf.
//Input: Binary Tree: 1 2 5 -1 -1 4 6 5 Output: 5
public class DiamaterOfBT {

    static int diameter(Node root){
        int[] maxiD = new int[1];
        maxiD[0] = 0;
        height(root, maxiD);
        return maxiD[0];
    }

    static int height(Node node, int[] maxiD){
        if (node == null) {
            return 0;
        }

        // Recursively calculate the
        // height of left and right subtrees
        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left, maxiD);
        rh[0] = height(node.right, maxiD);

        // Update the diameter with the maximum
        // of current diameter or sum of
        // left and right heights
        maxiD[0] = Math.max(maxiD[0], lh[0] + rh[0]);

        // Return the height of
        // the current node's subtree
        return 1 + Math.max(lh[0], rh[0]);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        System.out.println(diameter(root));
    }
}
