package com.in.dataStructure;

public interface isStackFull {

    public static void main(String[] args) {
        /*IntStack stack = new IntStack();

        if(stack.isEmpty())
        {
            stack.push(1);
            stack.push(2);

        }
        int pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.top);


        System.out.println(stack.stack.length -1);
*/


        Person per1 = new Person("Jainesh","0");
        Person per2 = new Person("Sunny","1");
        Person per3 = new Person("Test","2");
        PersonStack personStack = new PersonStack();
        personStack.push(per1);
        personStack.push(per3);
        personStack.push(per2);

        System.out.println(personStack.pop().toString());
        System.out.println(personStack.pop().toString());



    }
}
