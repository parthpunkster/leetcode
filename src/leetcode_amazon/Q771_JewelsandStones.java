package leetcode_amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q771_JewelsandStones {
    public static int numJewelsInStones(String J, String S){
        Set<Character> set = new HashSet<>();
        for(char c: J.toCharArray()) set.add(c);
        int count = 0;
        for (char c: S.toCharArray()) if(set.contains(c)) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
