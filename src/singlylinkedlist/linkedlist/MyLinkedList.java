package singlylinkedlist.linkedlist;
import singlylinkedlist.node.Node;
public class MyLinkedList {
    Node head;

    public MyLinkedList(){
        head=null;
    }

    public Node getHead() {
        return head;
    }
    //This inserts at last
    public void insertAtLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void insertAtBeginning(int data){
        Node node=new Node(data);
        node.setNext(head);
        head=node;
    }
    //delete from beginning
    public Node deleteFromBeginning(){
        Node response=null;
        response=head;
        if(head!=null){
            head=head.getNext();
        }
        return response;
    }
    //traverse
    public void printList(){
        System.out.println("Printing the list :");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.getNext();
            if(temp!=null){
                System.out.print("-->");
            }
        }
        System.out.println();
    }

}
