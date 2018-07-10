package q160_intersectionoftwolinkedlists;

import punksterutils.Node;

public class Main {
    public static Result getTailAndSize(Node head){
        if (head == null){
            return null;
        }
        int size = 0;
        while (head.next !=null){
            size++;
            head = head.next;
        }
        return new Result(head,++size);
    }

    public static Node getKthNode(Node head, int diff){
        while (diff != 0){
            head = head.next;
            diff--;
        }
        return head;
    }

    public static Node getIntersectionNode(Node headA, Node headB){
        if (headA == null || headB == null){
            return null;
        }
        Result r1 = getTailAndSize(headA);
        Result r2 = getTailAndSize(headB);
        if (r1.tail != r2.tail){
            return null;
        }
        Node shorter = r1.size < r2.size ? headA : headB;
        Node longer = r1.size >= r2.size ? headA : headB;
        longer = getKthNode(longer,Math.abs(r1.size - r2.size));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        f.next = g;
        g.next = h;
        h.next = d;
        System.out.println(getIntersectionNode(a,f).value);
    }
}
