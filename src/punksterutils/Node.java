package punksterutils;

public class Node {
    public int value;
    public Node next;
    

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void append(int value){
        Node tmp = new Node(value);
        Node n = this;
        while (n.next !=null){
            n = n.next;
        }
        n.next = tmp;
    }

    public void printList(){
        Node first = this;
        while (first != null){
            System.out.println(first.value);
            first = first.next;
        }
    }
}
