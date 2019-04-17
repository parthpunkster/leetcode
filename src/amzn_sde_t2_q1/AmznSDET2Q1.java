package amzn_sde_t2_q1;

import punksterUtils_new.ArrayUtils;

import java.util.*;

public class AmznSDET2Q1 {
    public static String[] subStringsOfKLength(String s, int k){
        HashSet<String> result = new HashSet<>();
        int len = s.length();
        if (len<k){
            return new String[0];
        }
        int index = 0;
        while (index+k <= len){
            String subString = s.substring(index,index+k);
            if (!result.contains(subString)) {
                char[] tmpArray = subString.toCharArray();
                HashSet<Character> tmpSet = new HashSet<>();
                for (char c:tmpArray){
                    tmpSet.add(new Character(c));
                }
                if (tmpSet.size() == k - 1) {
                    result.add(subString);
                }
            }
            index++;
        }
        return result.toArray(new String[0]);
    }

    public static List<String> subStringofLengthK(String s, int k){
        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i+k<=s.length();i++){
            set.add(s.substring(i,i+k));
        }
        List<String> res = new ArrayList<>();
        for (String str: set){
            res.add(str);
        }
        return res;
    }

    public static List<String> subStringOfLengthKUnique(String s, int k){
        HashSet<Character> set = new HashSet<>();
        List<String> res =  new ArrayList<>();
        int i = 0 ;
        int j = 0;
        while (i<s.length()&&j<s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                if (set.size() == k) {
                    res.add(s.substring(i,j));
                    set.remove(s.charAt(i++));
                }
            }
            else {
                set.remove(s.charAt(i++));
            }

        }
        return res;
    }

    public static void main(String[] args){
        String s = new String("bcaabc");
        List<String> result = subStringOfLengthKUnique(s,2);
        System.out.println(result);
//        for (String r: result){
//            System.out.println(r);
//        }
    }
}
