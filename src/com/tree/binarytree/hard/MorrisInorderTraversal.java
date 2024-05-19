package com.tree.binarytree.hard;

import java.util.ArrayList;
import java.util.List;

public class MorrisInorderTraversal {

    // Function to perform iterative Morris
    // inorder traversal of a binary tree
    public static List<Integer> getInorder(Node root) {
        // List to store the inorder traversal result
        List<Integer> inOrder = new ArrayList<>();
        // Pointer to the current node,starting from the root
        Node curr =root;
        // Loop until the current node is not NULL
        while (curr!=null) {
            // Add the value of the current node to the inorder lis
            if (curr.left == null) {
                inOrder.add(curr.data);
                curr = curr.right;
            } else {
                // If the left child is not NULL,
                // find the predecessor (rightmost node
                // in the left subtree)
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                // If the predecessor's right child
                // is NULL, establish a temporary link
                // and move to the left child
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    // If the predecessor's right child
                    // is already linked, remove the link,
                    // add current node to inorder list,
                    // and move to the right child
                    prev.right = null;
                    inOrder.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return inOrder;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);

        List<Integer> preorder = getInorder(root);

        System.out.print("Binary Tree Morris Preorder Traveral: ");
        for (int i = 0; i < preorder.size(); i++) {
            System.out.print(preorder.get(i) + " ");
        }
        System.out.println();
    }
}
