
class Node {
    int data;     
    Node next;    
    Node prev;    

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;  

    public DoublyLinkedList() {
        head = null;
    }

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
        newNode.prev = lastNode;  
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;  
        }
        while (lastNode != null) {
            System.out.print(lastNode.data + " <-> ");
            lastNode = lastNode.prev;
        }
        System.out.println("null");
    }

    public void delete(int key) {
        Node current = head;
        if (current != null && current.data == key) {
            head = current.next;  
            if (head != null) {
                head.prev = null;  
            }
            current = null;
            return;
        }

        while (current != null && current.data != key) {
            current = current.next; 
        }

        if (current == null) {  
            System.out.println("Node with value " + key + " not found.");
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        current = null;
    }

   
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

public class Doubly_List {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.displayBackward();

        // System.out.println("Display list forward:");
        // dll.displayForward();

        // System.out.println("Display list backward:");
        // dll.displayBackward();

        // System.out.println("Searching for 20 in the list:");
        // if (dll.search(20)) {
        //     System.out.println("20 found in the list.");
        // } else {
        //     System.out.println("20 not found in the list.");
        // }

        // System.out.println("Deleting node with value 20:");
        // dll.delete(20);

        // System.out.println("List after deletion of 20:");
        // dll.displayForward();

        // System.out.println("Searching for 20 after deletion:");
        // if (dll.search(20)) {
        //     System.out.println("20 found in the list.");
        // } else {
        //     System.out.println("20 not found in the list.");
        // }
    }
}