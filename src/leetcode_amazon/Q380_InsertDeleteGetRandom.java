package leetcode_amazon;

import java.util.HashSet;

public class Q380_InsertDeleteGetRandom {

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        set.insert(0);
        set.insert(1);
        System.out.println(set.remove(0));
        set.insert(2);
        System.out.println(set.remove(1));
        System.out.println(set.getRandom());
    }
}
