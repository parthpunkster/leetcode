package q155_minstack;


import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    NodeWithMin topvalue;

    public void push(int value){
        int min = Math.min(value,getMin());
        NodeWithMin n = new NodeWithMin(value,min);
        n.next = topvalue;
        topvalue = n;
    }

    public void pop(){
        if (topvalue == null){
            throw new EmptyStackException();
        }
        topvalue = topvalue.next;
    }

    public int top(){
        return topvalue.value;
    }

    public int getMin(){
        if (topvalue == null){
            return Integer.MAX_VALUE;
        }
        return topvalue.min;
    }
}
