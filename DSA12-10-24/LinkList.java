import java.util.Scanner;

public class LinkList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data;
        String userInput;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Do you want to add more data? If yes, press 'y'; otherwise, press 'n': ");
            userInput = sc.next(); // Accept 'y' or 'n' input
            if (!userInput.equalsIgnoreCase("y")) {
                break; // Exit the loop if the user doesn't press 'y'
            }

            System.out.print("Enter the key to insert the node at: 1 => Start, 2 => Mid, 3 => End: ");
            int m = sc.nextInt();

            System.out.println("Enter the data:");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;  // Add the first node
            } else {
                switch (m) {
                    case 1:  // Insert at start
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:  // Insert in the middle
                        System.out.print("Enter the position of the new node to be inserted: ");
                        int p = sc.nextInt();

                        if (p == 1) {  // If inserting at the head position
                            new_node.next = head;
                            head = new_node;
                        } else {
                            Node temp1 = head;
                            for (int i = 1; i < (p - 1); i++) {
                                if (temp1.next != null) {
                                    temp1 = temp1.next;
                                } else {
                                    System.out.println("Position out of bounds, inserting at the end.");
                                    break;
                                }
                            }
                            new_node.next = temp1.next;
                            temp1.next = new_node;
                        }
                        break;

                    case 3:  // Insert at end
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    default:
                        System.out.println("Invalid input! Try again.");
                        break;
                }
            }

        } while (userInput.equalsIgnoreCase("y"));  // Continue looping while user enters 'y'

        sc.close();  // Close the scanner after use
    }

    public void traverser() {
        Node temp = head;

        if (head == null) {
            System.out.println("The linked list does not exist.");
        } else {
            System.out.println("Elements in the linked list:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkList l2 = new LinkList();  // Correct class name to LinkList
        l2.creation();
        l2.traverser();
    }
}
