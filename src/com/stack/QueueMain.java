package com.stack;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.insert(11);
        customQueue.insert(22);
        customQueue.insert(33);
        customQueue.insert(44);
        customQueue.insert(55);
        //customQueue.insert(66);
        customQueue.display();
        System.out.println(customQueue.front());
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.display();
        customQueue.remove();
    }
}
