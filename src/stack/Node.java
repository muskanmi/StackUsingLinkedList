package stack;

public class Node {
    private  int data;
    private Node next;

    public Node(int size) {
        this.data = data;
        next = null;
    }
    //getter and setter

    public int getData() {
        return data;
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
}
