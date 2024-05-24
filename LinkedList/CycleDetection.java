package LinkedList;

public class CycleDetection {
    
    Node head;
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public void InsertAtEnd(int newdata)
    {
        Node newNode = new Node(newdata);

        // if the linked list is empty
        if(head==null)
        {
            head = new  Node(newdata);
            return;   
        }
        
        // limked list is not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void DetectCycle()
    {
        Node slow = head , fast = head;
        int flag = 0;
        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Loop is not detected");
        }
        else
        {
            System.out.println("Loop is detected");
        }
    }

    public void displayLL()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        CycleDetection llist = new CycleDetection();    
        llist.InsertAtEnd(10);
        llist.InsertAtEnd(20);
        llist.InsertAtEnd(30);
        llist.InsertAtEnd(40);
        llist.InsertAtEnd(50);
        llist.InsertAtEnd(60);
        llist.displayLL();
        System.out.println();

        Node temp = llist.head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = llist.head;   

        llist.DetectCycle();
        // llist.displayLL();
        


    }
    


}
