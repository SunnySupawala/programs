package com.in.dataStructure;



public class IntStack {

    int [] stack;
    int top;
    int size;

    IntStack(int size) {

        top = -1;
        this.size = size;
        this.size = size;
        stack = new int[this.size];
    }

    IntStack()
    {
        top = -1;
        size = 50;
        stack = new int[50];


    }

    public boolean push(int data)
    {
        if(!isFull())
        {
            top++;
            stack[top] = data;

            return true;
        }
        return false;


    }
    public  int pop() {
        return stack[top--];


    }

    public boolean isFull()
    {
        System.out.println( (stack.length - 1));

        return top == (stack.length - 1);
    }

    public boolean  isEmpty () {
        if(top >= size)
        {
            return false;
        }
        return true;
    }



}
