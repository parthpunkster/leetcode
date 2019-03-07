package t1_q83_removeduplicatesfromsortedlist;
import punksterUtils_new.ListNode;

public class T1_RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null) return head;
        ListNode i = head;
        ListNode j = head.next;

        while (i != null){
            if (j == null){
                i.next = j;
                i = j;
            }
            else if (i.value == j.value) j = j.next;
            else if (i.value != j.value) {
                i.next = j;
                i = j;
                j = j.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.value = 1;
        b.value = 1;
        c.value = 2;
        a.next = b;
        b.next = c;
        ListNode result = deleteDuplicates(a);
        while (result.next != null){
            System.out.print(result.value + "->");
            result = result.next;
        }
        System.out.print(result.value);
    }
}
