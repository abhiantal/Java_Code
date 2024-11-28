class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList2 {
    Node head;

    // Method to append a node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Method to prepend a node at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete a node by value
    public void deleteNode(int key) {
        Node current = head;

        // If head node itself holds the key
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key to be deleted
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key is not found
        if (current == null) {
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkList2 llist = new LinkList2();

        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.append(4);

        System.out.println("Original List:");
        llist.printList();

        llist.prepend(0);
        System.out.println("After Prepending 0:");
        llist.printList();

        llist.deleteNode(3);
        System.out.println("After Deleting 3:");
        llist.printList();

        llist.reverse();
        System.out.println("Reversed List:");
        llist.printList();
    }
}
