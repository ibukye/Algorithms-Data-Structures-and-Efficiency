class Node {
    private Object element;
    private Node next;

    public Node(Object elem, Node n) {
        element=elem;
        next=n;
    }

    // Getter
    public Object getElement() {
        return element;
    }
    public Node getNext() {
        return next;
    }
    // Setter
    public void setElement(Object newElem) {
        element=newElem;
    }
    public void setNext(Node newNext) {
        next=newNext;
    }
}

public class LinkedList {
    // Display all the nodes
    public static void displayAll(Node node1) {
        Node current = node1;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    // Insert at the head
    public static Node insertHead(Object newElem, Node prevHead) {
        Node newNode = new Node(newElem, prevHead);
        return newNode;
    }

    // Remove the head
    public static Node removeHead(Node head) {
        Node newHead = head.getNext();
        return newHead;
    }

    // Insert at the tail
    public static Node insertTail(Object newElem, Node head) {
        Node newTail = new Node(newElem, null);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        } // HERE LOGIC <- while(current!=null);
        current.setNext(newTail);
        return head;
    }

    // Remove at the tail
    public static Node removeTail(Node head) {
        // ERROR HANDLING
        if (head == null || head.getNext()==null) return null;
        Node current = head;
        while (current.getNext().getNext()!=null) {
            current=current.getNext();
        }
        current.setNext(null);
        return head;
    }


    public static void main(String[] args) {
        // must be this order 3->2->1
        Node node3 = new Node("C", null);
        Node node2 = new Node("B", node3);
        Node node1 = new Node("A", node2);
        Node head = node1;

        // display from node1
        System.out.println("Before Inserting");
        displayAll(head);

        // Insert at the head
        head = insertHead("D", node1);
        System.out.println("After Inserted Head");
        displayAll(head);

        // Remove the head
        head = removeHead(head);
        System.out.println("After removed Head");
        displayAll(head);

        // Insert at the tail
        head = insertTail("D", head);
        System.out.println("After Inserted Tail");
        displayAll(head);

        // Remove at the tail
        head = removeTail(head);
        System.out.println("After removed Tail");
        displayAll(head);
    }   
}