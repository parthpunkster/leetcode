package leetcode_amazon;

public class Q146_LRUCache {

    public static void main(String[] args) {
        LRUCache_dll_map cache = new LRUCache_dll_map( 1 /* capacity */ );

        cache.put(2, 1);
        System.out.println(cache.get(2));       // returns 1
        cache.put(3, 2);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4
    }
}