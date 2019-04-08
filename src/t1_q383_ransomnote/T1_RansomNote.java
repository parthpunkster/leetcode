package t1_q383_ransomnote;

import java.util.HashMap;

public class T1_RansomNote {
    public static boolean canConstruct(String ransomeNote,String magazine){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i <magazine.length();i++){
            if (map.containsKey(magazine.charAt(i))) map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            else map.put(magazine.charAt(i),1);
        }
        for (int i = 0 ; i <ransomeNote.length();i++){
            if (map.containsKey(ransomeNote.charAt(i)) && map.get(ransomeNote.charAt(i))>0){
                map.put(ransomeNote.charAt(i),map.get(ransomeNote.charAt(i))-1);
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
