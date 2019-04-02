package t1_q225_implementstackusingqueues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class StackUsingQueueUsingOneQueue {
    Queue<Integer> q;

    public StackUsingQueueUsingOneQueue(){
        q = new LinkedBlockingQueue<>();
    }

    public void push(int x){
        q.add(x);
        int size = q.size()-1;
        while (size > 0){
            q.add(q.remove());
            size--;
        }
    }

    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.isEmpty();
    }
}
