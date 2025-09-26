class Node {
    Node prev;
    Object element;
    Node next;

    // Constructor
    public Node(Node prevNode, Object elem, Node nextNode) {
        prev=prevNode;
        element=elem;
        next=nextNode;
    }

    // Getter
    public Node getPrev() { return prev; }
    public Node getNext() { return next; }
    public Object getElement() { return element; }
    // Setter
    public void setPrev(Node newPrev) { prev=newPrev; }
    public void setNext(Node newNext) { next=newNext; }
    public void setElem(Object newElement) { element=newElement; }
}

public class DoublyLinkedList {
    // Display all nodes
    public static void displayAll(Node head) {
        Node current=head;
        while (current != null) {
            System.out.println(current.getElement());
            current=current.getNext();
        }
    }
    // Insert into
    public static Node addAfter(Node prevNode, Object e) {
        Node newNode = new Node(prevNode, e, prevNode.getNext());
        Node nextNode = prevNode.getNext();
        prevNode.setNext(newNode);
        nextNode.setPrev(nextNode);
        return newNode;
    }
    
    public static void main(String[] args) {
        // Set the link after declared
        Node node1 = new Node(null, "A", null);
        Node node2 = new Node(node1, "B", null);
        Node node3 = new Node(node2, "C", null);
        node1.setNext(node2);
        node2.setNext(node3);
        Node head = node1;

        System.out.println("Original List");
        displayAll(head);
        
        // insert D after node2
        System.out.println("After inserted");
        Node nodeD = addAfter(node2, "D");
        displayAll(head);
    }
}
