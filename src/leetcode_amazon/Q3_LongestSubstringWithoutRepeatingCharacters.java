package leetcode_amazon;

import java.util.HashMap;
import java.util.HashSet;

public class Q3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubString(String s){
        char[] str = s.toCharArray();
        int i = 0 ;
        int j = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        while (i<str.length && j<str.length){
            if (!set.contains(str[j])){
                set.add(str[j++]);
                maxlen = Math.max(maxlen,j-i);
            }
            else {
                set.remove(str[i++]);
            }
        }
        return maxlen;
    }

    public static int lengthOfLongestSubString_opt(String s){
        char[] str = s.toCharArray();
        int i = 0 ;
        int j = 0;
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (i<str.length && j<str.length){
            if (!map.containsKey(str[j])){
                map.put(str[j],j);
                j++;
                maxlen = Math.max(maxlen,j-i);
            }
            else {
                i = Math.max(i,map.get(str[j])+1);
                map.put(str[j],j);
                j++;
                maxlen = Math.max(maxlen,j-i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString_opt("tmmzuxt"));
    }
}
