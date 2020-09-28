package com.in.dataStructure.doublelist;

import com.in.dataStructure.linkedlist.LinkedList;

public class DoubleLinkedList {
    Node head;

    Node tail;

    DoubleLinkedList(){
        Node newNode = new Node();
        newNode.value = 0;
        head = newNode;
        newNode.prev = null;
        newNode.next = null;


    }
    public boolean insertFirst(int item){
        Node n = new Node();
        n.value = item;
        n.prev = null;
        head.prev = n;
        n.next = head;
        return true;
    }

    public boolean deleteItem(int item){
        boolean isDelete = false;
        if(head.next.value == item)
        {
            head.next = head.next.next;
            isDelete =  true;
        }else {
            Node x = head;
            Node y = head.next;
            while (true){
                if(y == null || y.value == item){
                    break;
                }else {
                    x = y ;
                    y = y.next;
                }
            }
            if(y != null){
                x.next = y.next ;
                isDelete =  true;
            }
            else {
                isDelete =  false;
            }

        }
        return isDelete;

    }


    class Node{
        Node prev ;
        int value;
        Node next;
    }
}
