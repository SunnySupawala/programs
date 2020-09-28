package com.in.dataStructure.linkedlist;

import com.in.dataStructure.Person;

public class PracticeLinkedList1 {

    Node head;


    Node tail;

    /*PracticeLinkedList1() {
        head = new Node();
        head.value = new Person();
        head.link = null;
    }*/

    public void printLinkedList() {

        Node z = head.link;
        while (z != null)
        {
            System.out.println(z.value.toString());
            z = z.link;
        }
    }

    public boolean insertlastItem(Person item){
        Node newNode = new Node();
        Node n = head;
        while (n.link != null) {
            n = n.link;
        }
        newNode.value = item;
        newNode.link = null;
        n.link = newNode;
        return true;

    }


    public boolean deleteItem(String item) {

        if(head.link.value.getName().equals(item)){
            head.link = head.link.link;
        }
        Node x = head;
        Node y = head.link;
        while (y != null && !(y.value.getName().equals(item))) {
                x = y;
                y = y.link;
        }
        if(y != null){
            x.link = y.link;
            return true;
        }else {
            return false;
        }

    }

    class Node {
        Person value ;
        Node link;
    }

}
