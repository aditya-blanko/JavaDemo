package LinkedList;

public class MiddleOfLL {
    
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

    public void MiddleNode()
    {
        Node slow = head , fast = head;
        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node of the linked list is " + slow.data);
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
        MiddleOfLL llist = new MiddleOfLL();    
        llist.InsertAtEnd(10);
        llist.InsertAtEnd(20);
        llist.InsertAtEnd(30);
        llist.InsertAtEnd(40);
        llist.InsertAtEnd(50);
        llist.InsertAtEnd(60);
        llist.displayLL();
        System.out.println();

        llist.MiddleNode();
        // llist.displayLL();
        


    }
    


}
