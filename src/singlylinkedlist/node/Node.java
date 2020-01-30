package singlylinkedlist.node;


public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data=data;
        next=null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return data+"";
    }

}
