package leetcode_amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LRUCache {
    Queue<Integer> queue;
    HashMap<Integer,Integer> map;
    int capacity;
    public LRUCache(int capactiy){
        queue = new LinkedBlockingQueue<>(capactiy);
        map = new HashMap<>(capactiy);
        this.capacity = capactiy;
    }

    public int get(int key){
        if (map.containsKey(key)){
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value){
        if (queue.contains(key)) queue.remove(key);
        else if (capacity == queue.size()){
            map.remove(queue.remove());
        }
        queue.add(key);
        map.put(key,value);
    }


}
