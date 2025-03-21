// Singly Linked List implementation with required java  methods
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

    //  Function to insert a node at the beginning
    public void insertAtBeginning(int data) {
    // Creating a new node
        Node newNode = new Node(data);
        // Point new node to current head 
        newNode.next = head;
        // Update head to new node        
        head = newNode;                
    }

    //  Function to insert a node at the end
    public void insertAtEnd(int data) {
     // Creating a new node
        Node newNode = new Node(data);
        // If list is empty, new node is head 
        if (head == null) {            
            head = newNode;
            return;
        }
        // Traverse to the last node
        Node current = head;           
        while (current.next != null) {
            current = current.next;
        }
         // Link new node at the end
        current.next = newNode;       
    }

    //  Function to delete a node from the beginning
    public void deleteFromBeginning() {
   // Check if list is empty
        if (head == null) {          
            System.out.println("List is empty");
            return;
        }
         // Move head to next node
        head = head.next;             
    }

    //  Method to print the list (for testing)
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
       // Add 1
        list.insertAtEnd(1);  
      // Add 2 at start
        list.insertAtBeginning(2); 
          // Add 3 at end
        list.insertAtEnd(3); 
        // Output: 2 -> 1 -> 3 -> null       
        System.out.println("Original list:");
        list.printList(); 
        // Remove 2           
        list.deleteFromBeginning();  
        System.out.println("After deleting from beginning:");
        // Output: 1 -> 3 -> null
        list.printList();            
    }
}