package t1_q205_isomorphicstrings;

import java.util.HashMap;

public class T1_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()) return false;
        int i = 0;
        HashMap<Character,Character> map = new HashMap<>();
        while (i<s.length()){
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) return false;
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) return false;
            map.put(s.charAt(i),t.charAt(i));
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isIsomorphic("ab","aa"));
    }
}
