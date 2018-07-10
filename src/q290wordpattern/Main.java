package q290wordpattern;

import java.util.HashMap;

public class Main {
    public static boolean wordPattern(String pattern, String str){
        String[] tmp = str.split(" ");
        if (tmp.length != pattern.length()) return false;
        HashMap<Character,String> map = new HashMap<>();
        for (int i = 0; i<tmp.length;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if (!map.containsValue(tmp[i])){
                    map.put(pattern.charAt(i),tmp[i]);
                }
                else {
                    return false;
                }
            }
            else {
                if (map.get(pattern.charAt(i)).equals(tmp[i])){
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}
