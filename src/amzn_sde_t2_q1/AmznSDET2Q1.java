package amzn_sde_t2_q1;

import punksterUtils_new.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

    public static void main(String[] args){
        String s = new String("aaaaaa");
        String[] result = subStringsOfKLength(s,2);
        for (String r: result){
            System.out.println(r);
        }
    }
}
