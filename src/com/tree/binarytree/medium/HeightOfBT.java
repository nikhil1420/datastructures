package com.tree.binarytree.medium;

// Problem Statement: Given the root of a Binary Tree, return the height of the tree. The height of the tree is equal to the number of nodes on the longest path from root to a leaf.
//Input: Binary Tree: 1 2 5 -1 -1 4 6 5 Output: 5
public class HeightOfBT {

    static int findHeight(Node root){
      if(root == null) return 0;
      int left = findHeight(root.left);
      int right  = findHeight(root.right);
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
        System.out.println(findHeight(root));
    }
}
