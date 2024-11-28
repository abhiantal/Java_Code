// Node class represents each element in the linked list
class Node {
    int data;  // Data of the node
    Node next;  // Pointer to the next node

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents the entire singly linked list
class LinkedList {
    Node head;  // Head of the list

    // Constructor to create an empty list
    public LinkedList() {
        head = null;
    }

    // Method to append a new node with data to the list
    public void append(int data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If the list is empty, make this the head
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;  // Traverse to the last node
        }
        lastNode.next = newNode;  // Link the last node to the new node
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");  // End of the list
    }

    // Method to delete a node by value
    public void delete(int key) {
        Node current = head;
        if (current != null && current.data == key) {
            head = current.next;  // Move head to the next node
            current = null;
            return;
        }

        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {  // Element not found
            System.out.println("Node with value " + key + " not found.");
            return;
        }

        prev.next = current.next;  // Unlink the node from the list
        current = null;
    }

    // Method to search for a value in the list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

// Main class to test the LinkedList implementation
public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);

        System.out.println("Original Linked List:");
        ll.display();

        System.out.println("Searching for 20 in the list:");
        if (ll.search(20)) {
            System.out.println("20 found in the list.");
        } else {
            System.out.println("20 not found in the list.");
        }

        System.out.println("Deleting node with value 20:");
        ll.delete(20);

        System.out.println("Linked List after deletion:");
        ll.display();

        System.out.println("Searching for 20 after deletion:");
        if (ll.search(20)) {
            System.out.println("20 found in the list.");
        } else {
            System.out.println("20 not found in the list.");
        }
    }
}