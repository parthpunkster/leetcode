package ctci_myqueue;


import java.util.NoSuchElementException;

public class MyQueue<T> {
    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item){
        QueueNode<T> newNode = new QueueNode<T>(item);
        if (last != null){
            last.next = newNode;
        }
        last = newNode;
        if (first == null){
            first = last;
        }
    }

    public T remove(){
        if (first == null) throw new NoSuchElementException();
        T value = first.data;
        first = first.next;
        if (first==null) last=null;
        return value;
    }

    public T peek(){
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        QueueNode iterator = first;
        int size=0;
        while (iterator != null){
            size++;
            iterator = iterator.next;
        }
        return size;
    }
}
