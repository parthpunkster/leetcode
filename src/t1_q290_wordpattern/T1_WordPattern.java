package t1_q290_wordpattern;

import java.util.HashMap;

public class T1_WordPattern {
    public static boolean wordPattern(String pattern,String str){
        String[] tmpArray = str.split(" ");
        if (pattern.length() != tmpArray.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        for (int i = 0 ; i<pattern.length();i++){
            if (map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(tmpArray[i])){
                return false;
            }
            if(!map.containsKey(pattern.charAt(i)) && map.containsValue(tmpArray[i])) return false;
            map.put(pattern.charAt(i),tmpArray[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}
