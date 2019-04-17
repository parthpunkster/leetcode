package leetcode_amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q819_MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned){
        paragraph = paragraph+".";
        paragraph = paragraph.toLowerCase();
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        for(char c : paragraph.toCharArray()){
            if (Character.isLetter(c)){
                word.append(c);
            }
            else if (word.length() > 0) {
                if (!set.contains(word.toString())) {
                    if (map.containsKey(word.toString())) map.put(word.toString(), map.get(word.toString()) + 1);
                    else map.put(word.toString(), 1);
                    word = new StringBuilder();
                } else {
                    word = new StringBuilder();
                }
            }
        }
        System.out.println(map);
        String maxWord = "";
        int maxLength = 0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if (entry.getValue() > maxLength){
                maxLength = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
    }
}
