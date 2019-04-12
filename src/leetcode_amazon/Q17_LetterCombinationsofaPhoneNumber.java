package leetcode_amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q17_LetterCombinationsofaPhoneNumber {
    public static HashMap<String,String> map = new HashMap<>(){
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }};

    static List<String> result = new ArrayList<>();

    public static void backtracking(String combination, String digits){
        if (digits.length() == 0) result.add(combination);
        else {
            for (char c:map.get(digits.substring(0,1)).toCharArray()){
                backtracking(combination+c,digits.substring(1));
            }
        }
    }

    public static List<String> letterCombinations(String digits){
        if (digits.length() == 0) return result;
        backtracking("",digits);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
