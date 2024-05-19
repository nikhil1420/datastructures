package com.tree.binarytree.traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {
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
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while(true){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }

        else {
                if (stack.isEmpty())
                    break;
                temp = stack.pop();
                arr.add(temp.data);
                temp = temp.right;
            }
        }
        return arr;
    }
}
