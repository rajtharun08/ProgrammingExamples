package DSA;

public class LinkedList {
    Node head;
    public void insert(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
