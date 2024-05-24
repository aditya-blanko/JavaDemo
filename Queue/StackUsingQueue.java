package Queue;

import java.util.*;

public class StackUsingQueue {
    
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();

    static void add(int data)
    {
        // 1. move the elements from q1 to q2
        while(!queue1.isEmpty())
        {
            // first copy the elements from q1 to q2 then delete from q1
            queue2.add(queue1.peek());
            queue1.poll();
        }

        // 2. add new element in q1
        if(queue1.isEmpty())
        {
            queue1.add(data);
        }

        // 3. move back all the elements from q2 to q1
        while(!queue2.isEmpty())
        {
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    static int delete()
    {
        if(queue1.isEmpty())
        {
            System.out.println("Stack underflow");

        }
        int element = queue1.peek();
        queue1.poll();
        return element;
    }

    public static void main(String[] args) {
        StackUsingQueue staq = new StackUsingQueue();
        staq.add(1);
        staq.add(2);
        staq.add(3);
        staq.add(4);
        staq.add(5);

        System.out.println("Deleted element is " + staq.delete());
        
    }

}
