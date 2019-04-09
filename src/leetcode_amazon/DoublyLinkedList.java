package leetcode_amazon;

public class DoublyLinkedList {
    DoublyListNode head;
    DoublyListNode tail;
    int size;
    int capacity;

    public DoublyLinkedList(int capacity){
        this.capacity = capacity;
        this.size = 0;
        head = null;
        tail = null;
    }

    public DoublyListNode addElem(int key, int val){
        DoublyListNode tmp = new DoublyListNode(key,val);
        if (head == null && tail == null){
            head = tmp;
            tail = tmp;
        }
        else {
            head.prev = tmp;
            tmp.next = head;
            head = tmp;
        }
        size++;
        return tmp;
    }

    public int removeTail(){
        int v = tail.key;
        if (size != 1) {
            DoublyListNode tmp = tail.prev;
            tail.prev.next = null;
            tail.prev = null;
            tail = tmp;
        }
        else {
            head = null;
            tail = null;
        }
        size--;
        return v;
    }

    public void removeNode(DoublyListNode node){
        if (node != head && node != tail) {
            DoublyListNode tmp = node.prev;
            tmp.next = node.next;
            node.next.prev = tmp;
            node.prev = null;
            node.next = null;
        }
        else if (node == head){
            if (size!=1) {
                DoublyListNode tmp = node.next;
                tmp.prev = null;
                node.next = null;
                head = tmp;
            }
            else {
                node = null;
                head = null;
                tail = null;
            }
        }
        else if (node == tail){
            if (size!=1) {
                DoublyListNode tmp = node.prev;
                tmp.next = null;
                node.prev = null;
                tail = tmp;
            }
            else {
                node = null;
                head = null;
                tail = null;
            }
        }
        size--;
    }

}
