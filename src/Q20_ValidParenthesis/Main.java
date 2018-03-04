package Q20_ValidParenthesis;

import java.util.Stack;

public class Main {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i< str.length(); i++) {
            char element = str.charAt(i);

            if (element == '{' || element == '[' || element =='(') {
                stack.push(element);
            }
            else if(stack.isEmpty()) {
                return false;
            }
            else if (element == '}' && stack.peek() == '{') {
                stack.pop();
            }
            else if (element == ']' && stack.peek() == '[') {
                stack.pop();
            }
            else if (element == ')' && stack.peek() == '(') {
                stack.pop();
            }
            else return false;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // write your code here
        String s = "{";
        System.out.println(isValid(s));
    }
}
