package com.stack;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    int end =0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot remove from an empty queue");
        }
        int item = data[0];
        for (int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return item;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty queue");
        }
        return data[0];
    }

    public void display() {
        for (int i=0;i<end;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end==data.length;
    }

    private boolean isEmpty() {
        return end==0;
    }
}
