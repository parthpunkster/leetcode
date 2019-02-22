package t1_q20_validparentheses;

import java.util.HashMap;
import java.util.Stack;

public class T1_ValidParentheses {
    public static boolean isValid(String s){
        if (s.isEmpty()) return true;
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length();i++){
            if (map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else {
                if (!stack.isEmpty() && map.get(s.charAt(i)) == stack.peek()){
                    stack.pop();
                }
                else return false;
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isValid("]"));
    }
}
