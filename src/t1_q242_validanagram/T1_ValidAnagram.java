package t1_q242_validanagram;

import java.util.HashMap;
import java.util.Map;

public class T1_ValidAnagram {

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
            i++;
        }
        i = 0;
        while (i < t.length()){
            if (!map.containsKey(t.charAt(i))) return false;
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
            i++;
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() != 0) return false;
        }
        return true;

    }

    public static boolean isAnagram1(String s, String t){
        if (s.length() != t.length()) return false;
        int[] checker = new int[26];
        int i = 0;
        while (i<s.length()){
            checker[s.charAt(i)-'a']++;
            checker[t.charAt(i)-'a']--;
            i++;
        }
        for (int c : checker){
            if (c!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram1("anagram","nagaram"));
    }
}
