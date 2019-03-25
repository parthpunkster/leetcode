package t1_q160_intersectionoftwolinkedlists;

import punksterUtils_new.ListNode;
import t1_q160_intersectionoftwolinkedlists.ResultOfLengthAndTail;

public class T1_IntersectionofTwoLinkedLists {
    public static ResultOfLengthAndTail getLengthAndTailOfSinglyLinkedList(ListNode head){
        int length = 0;
        while (head.next != null) {
            head = head.next;
            length++;
        }
        return new ResultOfLengthAndTail(++length,head);
    }

    public static ListNode shiftHeadToK(ListNode head,int diff){
        while(diff != 0){
            head = head.next;
            diff--;
        }
        return head;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return null;

        ResultOfLengthAndTail resultA = getLengthAndTailOfSinglyLinkedList(headA);
        ResultOfLengthAndTail resultB = getLengthAndTailOfSinglyLinkedList(headB);

        if (resultA.tail != resultB.tail) return null;

        ListNode longer = null;
        ListNode shorter = null;
        if (resultA.length >= resultB.length){
            longer = headA;
            shorter = headB;
        }
        else {
            longer = headB;
            shorter = headA;
        }
        longer = shiftHeadToK(longer,Math.abs(resultA.length-resultB.length));

        while (longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }

    public static void main(String[] args){
        ListNode headA = new ListNode(4);
        ListNode l1 = new ListNode(1);
        ListNode l2= new ListNode(8);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        ListNode headB = new ListNode(5);
        ListNode m1 = new ListNode(0);
        ListNode m2 = new ListNode(1);
        headA.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        headB.next = m1;
        m1.next = m2;
        m2.next = l2;
        System.out.println(getIntersectionNode(headA,headB).value);
    }
}
