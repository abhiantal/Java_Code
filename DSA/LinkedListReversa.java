public class LinkedListReversa {
    // Function to reverse a singly linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // Previous node
        ListNode current = head; // Current node

        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
        }
        return prev; // New head of the reversed list
    }

    // Example usage
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reverse the linked list
        head = reverseList(head);
        
        // Print reversed list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}
