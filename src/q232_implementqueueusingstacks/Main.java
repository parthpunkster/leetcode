package q232_implementqueueusingstacks;

import punksterutils.Node;

public class Main {
    public static boolean isPalindrome(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) slow = slow.next;
        fast = reverse(slow);
        slow = head;
        while (fast != null){
            if (fast.value != slow.value) return false;
            fast = fast.next;
            slow=slow.next;
        }
        return true;
    }

    public static Node reverse(Node head){
        Node prev = null;
        while (head != null){
            Node tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(2);
        head.append(1);
        System.out.println(isPalindrome(head));
    }
}
