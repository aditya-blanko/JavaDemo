package LinkedList;

public class ReverseLL {
    
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

    // Iterative Approach
    // public void ReverseList()
    // {
    //     Node current = head;
    //     Node next = null;
    //     Node previous = null;

    //     while(current != null)
    //     {
    //         next = current.next;
    //         current.next = previous;
    //         previous = current;
    //         current = next;
    //     }
    //     head = previous;
    //     return;
    // }

    // Recursive Approach
    public void ReverseRec(Node current,Node previous)
    {
        // last node of linked list
        if(current.next == null)
        {
            head = current;
            current.next = previous;
            return;
        }
        Node nextptr = current.next;
        current.next = previous;
        ReverseRec(nextptr, current);

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
        ReverseLL llist = new ReverseLL();    
        llist.InsertAtEnd(10);
        llist.InsertAtEnd(20);
        llist.InsertAtEnd(30);
        llist.InsertAtEnd(40);
        llist.InsertAtEnd(50);
        llist.displayLL();
        System.out.println();

        llist.ReverseRec(llist.head,null);
        llist.displayLL();
        


    }
    


}
