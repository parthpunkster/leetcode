package q232_implementqueueusingstacks;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int elem){
        Stack<Integer> tmp = new Stack<Integer>();
        while (!stack.isEmpty()){
            tmp.push(stack.pop());
        }
        tmp.push(elem);
        while (!tmp.isEmpty()){
            stack.push(tmp.pop());
        }
    }

    public int pop(){
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

    public boolean empty(){
        return stack.isEmpty();
    }
}
