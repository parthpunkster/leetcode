package q205_isomorphicstrings;

import java.util.HashMap;

public class Main {
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> characterHashMap = new HashMap<Character, Character>();
        for (int i = 0; i<s.length(); i++){
            if(characterHashMap.containsKey(s.charAt(i))){
                if (!characterHashMap.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else {
                if (characterHashMap.containsValue(t.charAt(i))){
                    return false;
                }
                characterHashMap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isIsomorphic("ab","aa"));
    }
}
