
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        
        Node temp = head, prev = null;
        if (head.data == value) {
            if (head.next == head) {
                head = null;
                System.out.println("Deleted: " + value);
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            System.out.println("Deleted: " + head.data);
            head = head.next;
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.data != value);

        if (temp == head) {
            System.out.println("Element " + value + " not found.");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted: " + temp.data);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "INSERT":
                    list.insert(Integer.parseInt(parts[1]));
                    break;
                case "DELETE":
                    list.delete(Integer.parseInt(parts[1]));
                    break;
                case "DISPLAY":
                    list.display();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}
