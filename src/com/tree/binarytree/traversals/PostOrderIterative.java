package com.tree.binarytree.traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Getting preorder traversal
        List<Integer> result = postOrder(root);
        for (Integer val:result){
            System.out.print(val+" ");
        }
    }

    static List<Integer> postOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        if(root==null)
            return arr;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            Node node = stack1.pop();
            stack2.push(node);
            if(node.left!=null) stack1.push(node.left);
            if(node.right!=null) stack1.push(node.right);
        }
        while (!stack2.isEmpty()){
            //int val = stack2.pop().data
            arr.add(stack2.pop().data);
        }
        return arr;
    }
}
