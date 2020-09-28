package com.in.dataStructure.linkedlist;

public class LinkMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        //linkedList.deleteItem(4);
        linkedList.printList();
        linkedList.sortLinkedList();
        System.out.println();
        linkedList.printList();


        PracticeLinkedList1 practiceLinkedList1 = new PracticeLinkedList1();
        /*practiceLinkedList1.insertlastItem(1);
        practiceLinkedList1.insertlastItem(2);
        practiceLinkedList1.insertlastItem(3);
        practiceLinkedList1.insertlastItem(4);

        practiceLinkedList1.printLinkedList();*/

    }
}
