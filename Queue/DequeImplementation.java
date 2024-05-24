package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {

    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addLast(9);
        System.out.println("deque looks like "+ deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("after deletion" + deque);

    }
    
}
