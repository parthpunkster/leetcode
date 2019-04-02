package t1_q225_implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class StackUsingQueueUsingTwoQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;


    public StackUsingQueueUsingTwoQueue(){
        q1 = new LinkedBlockingQueue<>();
    }

    public void push(int x){
        q2 = new LinkedBlockingQueue<>();
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1 = q2;
    }

    public int pop(){
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}
