package t1_q225_implementstackusingqueues;

import t1_q225_implementstackusingqueues.StackUsingQueueUsingOneQueue;

public class T1_ImplementStackusingQueues {

    public static void main(String[] args){
        StackUsingQueueUsingTwoQueue q = new StackUsingQueueUsingTwoQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());
//        System.out.println(q.pop());
//        System.out.println(q.empty());
    }
}
