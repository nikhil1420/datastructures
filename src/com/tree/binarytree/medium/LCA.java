package com.tree.binarytree.medium;
//https://takeuforward.org/data-structure/lowest-common-ancestor-for-two-given-nodes/

//Problem Statement: Given a binary tree, Find the Lowest Common Ancestor for two given Nodes (x,y).
//
//Lowest Common Ancestor(LCA): The lowest common ancestor is defined between two nodes x and y as the lowest node in T that has both x and y as descendants (where we allow a node to be a descendant of itself.

import java.util.List;

//Example 1:
//
//        Input: x = 4 , y = 5
//
//        Output: 2
//
//        Explanation: All ancestors for 4,5 are 2,1.  But we need Lowest Common ancestor, So we will consider lowest and also common ancestor that is 2
public class LCA {
    static Node lowestCommonAncestor(Node root, Node p, Node q){
        if(root ==null || root==p || root==q)
            return root;

        // Recursively search left and right subtrees
        Node left = lowestCommonAncestor(root.left, p,q);
        Node right = lowestCommonAncestor(root.right, p,q);
        if(left==null) return right;
        else if(right==null) return  left;
        else // Both left and right are not null, we found our result
        return root;
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Nodes to find LCA for
        Node p = root.left.left;
        Node q = root.left.right;

        // Finding LCA
        Node lca = lowestCommonAncestor(root, p, q);

        // Printing the result
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p.data + " and " + q.data + " is: " + lca.data);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
        //printResult(result);
    }
}
