package singlylinkedlist.implementation;

import singlylinkedlist.linkedlist.MyLinkedList;
import singlylinkedlist.node.Node;

public class Implementation {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.insertAtLast(200);
        linkedList.insertAtLast(400);
        linkedList.printList();
        linkedList.insertAtBeginning(800);
        linkedList.insertAtBeginning(1600);
        linkedList.printList();
        deleteForMe(linkedList.deleteFromlast());
        linkedList.printList();
        deleteForMe(linkedList.deleteFromBeginning());
        linkedList.printList();

    }
    public static void deleteForMe(Node delete){
        if(delete!=null){
            System.out.println("Deleted data : "+delete.getData());
        }
        else{
            System.out.println("Empty List");
        }
    }
}
