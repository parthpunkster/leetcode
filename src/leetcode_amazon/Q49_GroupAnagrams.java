package leetcode_amazon;

import java.util.*;

public class Q49_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            if (map.containsKey(Arrays.toString(tmp))) map.get(Arrays.toString(tmp)).add(s);
            else {
                map.put(Arrays.toString(tmp), new ArrayList<>());
                map.get(Arrays.toString(tmp)).add(s);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
