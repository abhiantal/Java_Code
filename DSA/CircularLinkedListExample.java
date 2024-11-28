// Node class represents each element in the circular linked list
class Node {
    int data;  // Data of the node
    Node next;  // Pointer to the next node

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularLinkedList class represents the entire circular linked list
class CircularLinkedList {
    Node head;  // Head of the list

    // Constructor to initialize the list
    public CircularLinkedList() {
        head = null;
    }

    // Method to add a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
            newNode.next = head;  // Point the new node to itself
        } else {
            Node current = head;
            // Traverse to the last node
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;  // Link the last node to the new node
            newNode.next = head;  // Make the new node point back to head, completing the circle
        }
    }

    // Method to display the circular list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Method to delete a node by its value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head node
        if (head.data == key) {
            Node lastNode = head;
            // Traverse to the last node
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }
            // If there is only one node in the list
            if (head.next == head) {
                head = null;  // List becomes empty
            } else {
                head = head.next;  // Move head to the next node
                lastNode.next = head;  // Update the last node to point to the new head
            }
            return;
        }

        Node current = head;
        Node prev = null;
        // Traverse the list to find the node to delete
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
            if (current == head) break; // If we have traversed the entire circular list
        }

        if (current != null && current.data == key) {
            prev.next = current.next;  // Unlink the node from the list
            current = null;
        } else {
            System.out.println("Node with value " + key + " not found.");
        }
    }

    // Method to search for a node with a specific value
    public boolean search(int key) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }
}

// Main class to test the Circular Linked List implementation
public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.append(40);

        System.out.println("Circular Linked List:");
        cll.display();

        System.out.println("Searching for 20 in the list:");
        if (cll.search(20)) {
            System.out.println("20 found in the list.");
        } else {
            System.out.println("20 not found in the list.");
        }

        System.out.println("Deleting node with value 20:");
        cll.delete(20);

        System.out.println("List after deletion of 20:");
        cll.display();

        System.out.println("Searching for 20 after deletion:");
        if (cll.search(20)) {
            System.out.println("20 found in the list.");
        } else {
            System.out.println("20 not found in the list.");
        }
    }
}