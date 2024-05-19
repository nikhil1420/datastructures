package com.tree.binarytree.medium;

//Problem Statement: Given a Binary Tree, return true if it is a Balanced Binary Tree else return false. A Binary Tree is balanced if, for all nodes in the tree, the difference between left and right subtree height is not more than 1.//Input: Binary Tree: 1 2 5 -1 -1 4 6 5 Output: 5
public class CheckBalancedBT {

    // Function to check if a binary tree is balanced
    public static boolean isBalanced(Node root) {
        // Check if the tree's height difference
        // between subtrees is less than 2
        // If not, return false; otherwise, return true
        return findHeight(root) != -1;
    }

    static int findHeight(Node root){
      if(root == null) return 0;
      int left = findHeight(root.left);
        // If the left subtree is unbalanced propagate the unbalance status
       if (left == -1)
            return -1;
      int right  = findHeight(root.right);
        // If the right subtree is unbalanced,propagate the unbalance status
        if (right == -1)
            return -1;

        // Check if the difference in height between left and right subtrees is greater than 1 If it's greater, the tree is unbalanced, return -1 to propagate the unbalance status
        if (Math.abs(left - right) > 1)
            return -1;
        return 1+Math.max(left,right);
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
        if (isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}
