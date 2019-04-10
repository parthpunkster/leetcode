package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q23_MergekSortedLists {
    public static ListNode mergeKLists(ListNode[] lists){
        int indexOfMin = -1;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0 ; i < lists.length;i++){
            if (lists[i] != null && lists[i].value<minVal){
                minVal = lists[i].value;
                indexOfMin = i;
            }
        }
        if (indexOfMin == -1) return null;
        ListNode head = lists[indexOfMin];
        lists[indexOfMin] = lists[indexOfMin].next;
        head.next = mergeKLists(lists);
        return head;

    }

    public static void main(String[] args) {

    }
}
