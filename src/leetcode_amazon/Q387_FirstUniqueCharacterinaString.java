package leetcode_amazon;

import java.util.HashMap;

public class Q387_FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s){
        if (s == null || s.length() == 0) return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if (map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        for(int i = 0 ; i < s.length(); i++){
            if (map.get(s.charAt(i)) == 1) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
