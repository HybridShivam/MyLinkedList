package singlylinkedlist.implementation;

import singlylinkedlist.linkedlist.MyLinkedList;

public class Implementation {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertAtLast(200);
        linkedList.insertAtLast(400);
        linkedList.insertAtBeginning(800);
        linkedList.insertAtBeginning(1600);
        linkedList.printList();

    }
}
