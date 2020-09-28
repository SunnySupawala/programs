package com.in.dataStructure.queue;

public class IntQueue {

    int[]  queue ;
    int total;
    int front;
    int rear;
    int size;

    IntQueue()
    {
        size = 100;
        total = 0 ;
        front = 0;
        rear = 0;
        queue = new int[size];

    }
    IntQueue(int size)
    {
        this.size = size;
        total = 0 ;
        front = 0;
        rear = 0;
        queue = new int[this.size];

    }

    public boolean enQueue(int item) {
        if(isFull()){
            return false;
        }
        else {
            total++;
            queue[rear] = item;
            rear= (rear +1) % size;
            return true;
        }

    }
    public int deQueue() {
        /*if(rear == front)
        {
            front= front +1 % size;
        }*/
        int item = queue[front];
        front= (front +1) % size;
        total --;
        return item;

    }

    private boolean isFull() {
        if(total == size)
        {
            return true;
        }
        return false;
    }

    public void showAll()
    {
        int f = front;
        if(total !=0) {
            for (int i = 0 ; i < total ; i++)
            {
                System.out.println(f +" "+queue[f]);
                f = (f+1) %size;
                System.out.println(f);
            }
        }
    }
}
