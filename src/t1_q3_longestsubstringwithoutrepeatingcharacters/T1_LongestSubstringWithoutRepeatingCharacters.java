package t1_q3_longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.HashSet;

public class T1_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring_slidingWindow_optimized(String s){
        int i = 0 ;
        int j= 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        while (i< s.length() && j < s.length()){
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j),j++);
                maxLength = Math.max(maxLength,j-i);
            }
            else {
                i = Math.max(i,map.get(s.charAt(j)) + 1);
                map.put(s.charAt(j),j);
                j++;
                maxLength = Math.max(maxLength,j-i);
            }
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring_slidingWindow(String s){
        int i = 0 ;
        int j= 0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        while (i< s.length() && j < s.length()){
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength,j-i);
            }
            else {
                set.remove(s.charAt(i++));
             }
        }
        return maxLength;
    }


    public static boolean hasUniqueCharacter(String s,int start, int end){
        HashSet<Character> set = new HashSet<>();
        for(int i = start;i<end;i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }
        return true;
    }

    public static int lengthOfLongestSubstring_BruteForce(String s){
        int maxSum = 0;
        for(int i = 0;i<s.length();i++){
            for (int j = i+1 ; j <s.length();j++){
                if(hasUniqueCharacter(s,i,j)) maxSum = Math.max(maxSum,j-i);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring_slidingWindow_optimized("tmmzuxt"));
    }
}
