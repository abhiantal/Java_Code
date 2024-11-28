class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListReversal {
    // Function to reverse a singly linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initialize previous node as null
        ListNode current = head; // Start with the head of the list
        ListNode next = null; // Initialize next node

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
        }
        return prev; // Return the new head of the reversed list
    }

    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
