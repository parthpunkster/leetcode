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

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
