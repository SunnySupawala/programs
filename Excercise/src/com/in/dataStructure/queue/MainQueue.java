package com.in.dataStructure.queue;

public class MainQueue {

    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue(5);
        intQueue.enQueue(1);
        intQueue.enQueue(2);
        intQueue.enQueue(3);
        intQueue.enQueue(4);
        intQueue.enQueue(5);


        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());
        System.out.println("deque"+intQueue.deQueue());


        intQueue.showAll();

    }
}
