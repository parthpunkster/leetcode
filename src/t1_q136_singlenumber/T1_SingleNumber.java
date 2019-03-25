package t1_q136_singlenumber;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class T1_SingleNumber {
    public static int singleNumber_hashmap(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            if (map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else {
                map.put(n,1);
            }
        }
        for (int k : map.keySet()){
            if (map.get(k) == 1) return k;
        }
        return 0;
    }

    public static int singleNumber_math(int[] nums){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            sum += n;
            set.add(n);
        }
        Iterator<Integer> it = set.iterator();
        int sum1 = 0;
        while (it.hasNext()){
            sum1 += it.next() * 2;
        }
        return sum1-sum;
    }

    public static void main(String[] args){
        System.out.println(singleNumber_math(new int[]{2,2,4}));
    }
}
