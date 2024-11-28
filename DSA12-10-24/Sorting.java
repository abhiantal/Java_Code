class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sorting {    
    Node head;

// Add a node at the end
    public void addlast(int data) {
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

// Add a node at the beginning
    public void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

// Reverse the linked list
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

// Print the linked list
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
        Sorting llist = new Sorting();

        llist.addlast(1);
        llist.addlast(2);
        llist.addlast(3);
        llist.addlast(4);

        System.out.println("\n"+ "Original List:");
        llist.printList();

        llist.addfirst(0);
        System.out.println("\n"+ "After adding 0 at first:");
        llist.printList();

        llist.reverse();
        System.out.println("\n"+ "Reversed List:");
        llist.printList();

        llist.addlast(5);
        System.out.println("\n"+ "After addding 5 at end:");
        llist.printList();
    }
}
