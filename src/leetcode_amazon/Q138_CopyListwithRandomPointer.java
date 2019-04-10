package leetcode_amazon;

import java.util.HashMap;

public class Q138_CopyListwithRandomPointer {
    public static HashMap<ListNodeWithRandomPointer,ListNodeWithRandomPointer> map = new HashMap<>();

    public static ListNodeWithRandomPointer copyRandomList(ListNodeWithRandomPointer head){
        if (head == null) return null;

        if (map.containsKey(head)){
            return map.get(head);
        }
        ListNodeWithRandomPointer tmp = new ListNodeWithRandomPointer();
        map.put(head,tmp);
        tmp.value = head.value;
        tmp.next = copyRandomList(head.next);
        tmp.random = copyRandomList( head.random);
        return tmp;
    }

    public static void main(String[] args) {
        ListNodeWithRandomPointer head = new ListNodeWithRandomPointer();
        ListNodeWithRandomPointer tail = new ListNodeWithRandomPointer();
        head.value = 1;
        head.next = tail;
        head.random = tail;
        tail.next = null;
        tail.random = tail;
        ListNodeWithRandomPointer tmp = copyRandomList(head);
    }
}
