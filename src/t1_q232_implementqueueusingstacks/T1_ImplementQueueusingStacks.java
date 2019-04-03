package t1_q232_implementqueueusingstacks;

public class T1_ImplementQueueusingStacks {
    public static void main(String[] args){
        ImplementQueueusingStack_moretime q = new ImplementQueueusingStack_moretime();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}
