// Singly Linked List implementation with required methods
public class LinkedList {
    // Node class to represent each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create new node
        newNode.next = head;           // Point new node to current head
        head = newNode;                // Update head to new node
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create new node
        if (head == null) {            // If list is empty, new node is head
            head = newNode;
            return;
        }
        Node current = head;           // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;        // Link new node at the end
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {            // Check if list is empty
            System.out.println("List is empty");
            return;
        }
        head = head.next;              // Move head to next node
    }

    // Utility method to print the list (for testing)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);         // Add 1
        list.insertAtBeginning(2);   // Add 2 at start
        list.insertAtEnd(3);         // Add 3 at end
        System.out.println("Original list:");
        list.printList();            // Output: 2 -> 1 -> 3 -> null
        list.deleteFromBeginning();  // Remove 2
        System.out.println("After deleting from beginning:");
        list.printList();            // Output: 1 -> 3 -> null
    }
}