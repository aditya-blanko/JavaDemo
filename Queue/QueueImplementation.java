package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        
        Queue<Integer> que = new LinkedList<>();

        for(int i=0;i<10;i++)
        {
            // Add function
            que.add(i);
        }
        System.out.println("Queue looks like " + que);

        // remove function removes the front elment of the queue
        que.remove();

        // peek function displays the front element of the queue
        System.out.println("Front of Queue "+ que.peek());
        
        System.out.println("Now the size of the queue is "+ que.size());
        System.out.println(que.isEmpty());

    }
}
