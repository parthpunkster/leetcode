package leetcode_amazon;

import java.util.HashMap;
import java.util.Stack;

public class Q20_ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(char c:s.toCharArray()){
            if (map.containsKey(c)){
                if (stack.isEmpty()) return false;
                if (stack.pop() != map.get(c)) return false;
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}
