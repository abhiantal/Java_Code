import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for matching closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty, parentheses are balanced
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    // Example usage
    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        
        System.out.println("Is balanced: " + isBalanced(test1)); // Output: true
        System.out.println("Is balanced: " + isBalanced(test2)); // Output: false
    }
}
