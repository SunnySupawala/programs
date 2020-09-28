package com.in.dataStructure.linkedlist;

public class LinkedList {

    private Node head;

    //insert without item
    LinkedList() {
        head = new Node();
        head.value = 0;
        head.link = null;
    }

    //insert with item
    public boolean insertItem(int item){
        Node n = new Node();
        n.value = item;
        n.link = head;
        head = n;
        return true;
    }
    public void printList() {
        Node z = head.link;
        while (z != null){
            System.out.println(z.value);
            z = z.link;
        }
    }

    //delete with inserted without item
    public boolean deleteItem(int item){
        boolean isDelete = false;
        if(head.link.value == item)
        {
            head.link = head.link.link;
            isDelete =  true;
        }else {
            Node x = head;
            Node y = head.link;
            while (true){
                if(y == null || y.value == item){
                    break;
                }else {
                    x = y ;
                    y = y.link;
                }

            }
            if(y != null){
                x.link = y.link;
                isDelete =  true;
            }
            else {
                isDelete =  false;
            }

        }
        return isDelete;

    }

    public boolean insertLast(int item){
        Node n = new Node();
        Node newNode = head;
        while (newNode.link != null)
        {
            newNode = newNode.link;
        }
        n.value = item;
        n.link = null;
        newNode.link = n;
        return true;

    }
    public void sortLinkedList(){
        int c = 0;
        Node a = head.link;
        while (a.link != null ){
            Node b = head.link;
            while (b.link != null){
                if(b.value < b.link.value){
                  c = b.value;
                  b.value = b.link.value;
                  b.link.value = c;
                }
                b = b.link;
            }
            a = a.link;
        }

    }



     class Node{
         int value ;
         Node link;

    }
}
