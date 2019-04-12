package leetcode_amazon;

import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
    Stack<PairForMinStack> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(new PairForMinStack(x,Math.min(x,getMin())));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.isEmpty() ? Integer.MAX_VALUE: stack.peek().min;
    }
}
