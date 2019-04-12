package leetcode_amazon;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Q242_ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        int[] array = new int[26];
        for(int i= 0 ; i <s.length();i++){
            array[s.charAt(i)-'a']++;
            array[t.charAt(i)-'a']--;
        }

        for(int i:array) if (i != 0) return false;
        return true;
    }


    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram","gramana"));

        int[] num = new int[]{1,1,1,2,2,3};
//        int[] a2 = new int[]{0,5};
//
//        long sum = 0;
//        for(int i : a1){
//            sum += i;
//        }
//        for (int i:a2){
//            sum-=i;
//        }
//        System.out.println(sum);
//
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <num.length;i++) {
            if (map.containsKey(num[i])) map.put(num[i],map.get(num[i])+1);
            else map.put(num[i],1);
        }

        System.out.println(map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));

    }
}
