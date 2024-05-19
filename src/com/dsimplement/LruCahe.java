package com.dsimplement;

import java.util.HashMap;

class Node{
    Node prev, next;
            int key, value;
            Node(int _key, int _value) {
            key = _key;
            value = _value;
            }
            }
public class LruCahe {

    Node head = new Node(0,0), tail = new Node(0,0);
    HashMap<Integer, Node> hm = new HashMap<>();
    int capacity;

    public LruCahe(Node head, Node tail, int capacity) {
        this.head = head;
        this.tail = tail;
        this.capacity = capacity;
    }

    int getKey(int key){
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else
            return -1;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            remove(hm.get(key));
        }
        if (hm.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        hm.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        hm.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}
