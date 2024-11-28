class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListCycleDetector {
    // Function to detect a cycle in a linked list
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false; // An empty list has no cycles
        }

        ListNode slow = head; // Tortoise
        ListNode fast = head; // Hare

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1
            fast = fast.next.next; // Move fast pointer by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // Example usage
    public static void main(String[] args) {
        // Creating a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle back)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next = new ListNode(3);
        head.next = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next.next.next = head.next; // Creating a cycle here (5 -> 3)

        System.out.println("Has Cycle: " + hasCycle(head)); // Output: true

        // Creating a linked list without a cycle: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        System.out.println("Has Cycle: " + hasCycle(head2)); // Output: false
    }
}
