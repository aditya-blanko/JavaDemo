package LinkedList;

public class InsertionDeletion {

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

    public void InsertAtBeginning( int newdata)
    {
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAfter(Node prev_node , int newdata)
    {
        if(prev_node == null)
        {
            System.out.println("Previous node cannot contain null pointer");
        }

        Node newNode = new Node(newdata);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }


    public void DeleteNode(int positon)
    {
        Node temp = head;
        if(head == null)
        {
            return;
        }

        // Deletion at the beginning
        if(positon ==0)
        {
            head = temp.next;
            return;
        }

        // Deletion anywhere except beginning
        for(int i = 0;i<positon-1;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
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

    public static void main(String[] args) {
        InsertionDeletion llist = new InsertionDeletion();
        llist.InsertAtEnd(4);
        llist.InsertAtEnd(6);
        llist.InsertAtEnd(8);
        System.out.println("Linked list before insertion");
        llist.displayLL();
        System.out.println();
        System.out.println("Linked list after insertion");
        llist.InsertAtEnd(20);
        llist.InsertAtBeginning(2);
        llist.InsertAfter(llist.head.next,13 );
        llist.displayLL();
        System.out.println();
        System.out.println("Linked list after deletion");
        llist.DeleteNode(6);
        llist.displayLL();
        

    }
}
