package com.tree.binarytree.traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Getting preorder traversal
        List<Integer> result = preOrder(root);
        for (Integer val:result){
            System.out.print(val+" ");
        }
    }

    static List<Integer> preOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        if(root==null)
            return arr;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            arr.add(node.data);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return arr;
    }
}
