class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw an exception
        }
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // or throw an exception
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}

// Example usage
public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.peek()); // Output: 20
    }
}
