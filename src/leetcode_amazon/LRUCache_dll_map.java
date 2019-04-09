package leetcode_amazon;

import java.util.HashMap;

public class LRUCache_dll_map {
    HashMap<Integer,DoublyListNode> map;
    DoublyLinkedList list;

    public LRUCache_dll_map(int capacity){
        list = new DoublyLinkedList(capacity);
        map = new HashMap<>();
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            list.removeNode(map.get(key));
            map.remove(key);
        }
        else if (list.size >= list.capacity){
            map.remove(list.removeTail());
        }
        DoublyListNode tmp = list.addElem(key,value);
        map.put(key,tmp);
    }

    public int get(int key){
        if (map.containsKey(key)){
            DoublyListNode tmp = map.get(key);
            int v = tmp.val;
            list.removeNode(tmp);
            map.remove(key);
            map.put(key,list.addElem(key,v));
            return v;
        }
        return -1;
    }
}
