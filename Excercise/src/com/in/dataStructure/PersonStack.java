package com.in.dataStructure;



public class PersonStack {

    Person [] stack;
    int top;
    int size;

    PersonStack(int size) {

        top = -1;
        this.size = size;
        this.size = size;
        stack = new Person[this.size];
    }

    PersonStack()
    {
        top = -1;
        size = 50;
        stack = new Person[50];


    }

    public boolean push(Person data)
    {
        if(!isFull())
        {
            top++;
            stack[top] = data;

            return true;
        }
        return false;


    }
    public  Person pop() {
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
