package t1_q232_implementqueueusingstacks;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;
    public ImplementQueueusingStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x){
        if (stack1.isEmpty()){
            front = x;
        }
        stack1.push(x);
    }

    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if (!stack2.isEmpty()) return stack2.peek();
        return front;
    }

    public boolean empty(){
        if (stack1.isEmpty() && stack2.isEmpty()) return true;
        return false;
    }
}
