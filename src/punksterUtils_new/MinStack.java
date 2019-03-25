package punksterUtils_new;

import punksterUtils_new.NodeForStackWithMin;

public class MinStack {

    private NodeForStackWithMin topValue;
    public MinStack(){
        this.topValue = null;
    }

    public void push(int x){
        NodeForStackWithMin tmp = new NodeForStackWithMin(x,Math.min(x,getMin()));
        tmp.next = topValue;
        topValue = tmp;
    }

    public void pop(){
        topValue = topValue.next;
    }

    public int top(){
        return topValue.value;
    }

    public int getMin(){
        if (topValue == null) return Integer.MAX_VALUE;
        return topValue.minValue;
    }
}
