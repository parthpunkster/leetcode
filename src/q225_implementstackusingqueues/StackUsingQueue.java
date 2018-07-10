package q225_implementstackusingqueues;


import ctci_myqueue.MyQueue;


public class StackUsingQueue<T> {
    MyQueue<T> stack;

    public StackUsingQueue(){
        stack = new MyQueue<T>();
    }

    public void push(T element){
        stack.add(element);
        int size = stack.size();
        while (size > 1){
            stack.add(stack.remove());
        }
    }

    public T pop(){
        return stack.remove();
    }

    public T top(){
        return stack.peek();
    }

    public boolean empty(){
        return stack.isEmpty();
    }
}
