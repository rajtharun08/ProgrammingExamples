package DSA;

public class driver {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList();
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insert(1);             
        circularList.display();
    }
}
