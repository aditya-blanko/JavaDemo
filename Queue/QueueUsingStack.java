package Queue;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enQueue(int data)
    {
        stack1.push(data);
    }
 
    public int deQueue()
    {
        // if both the stacks are empty
        int element;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("Queue is empty ");
            System.exit(0);
        }
        if(stack2.empty())
        {
            // this loop will run until stack1 gets empty
            while(!stack1.empty())
            {
                element = stack1.pop();
                stack2.push(element);
            }
        }


        // Now pop the top element from stack2 to get the FIFO
        element = stack2.pop();
        return element;
    }

    
    public static void main(String[] args) {
        QueueUsingStack ques = new QueueUsingStack();
        ques.enQueue(1);
        ques.enQueue(2);
        ques.enQueue(3);
        ques.enQueue(4);
        ques.enQueue(5);

        System.out.println("Deleted element is "+ ques.deQueue());
        System.out.println("Deleted element is "+ ques.deQueue());
        
    }

}
