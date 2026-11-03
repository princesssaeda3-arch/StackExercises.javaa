import java.util.Stack;

public class StackExercises{

    public static void main(String[] args) {

        // TODO: 1 - Create a Stack of Strings called 'stack'

        Stack<String>mystack = new Stack<>();


        // TODO: 2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"
        mystack.push("Java");
        mystack.push("Python");
        mystack.push("C++");
        mystack.push("JavaScript");
        mystack.push("Go");

        // TODO: 3 - Peek at the top element without removing it
        System.out.println("Top element: " + mystack.peek());

        // Print the result (should be "Go")


        // TODO: 4 - Pop an element from the stack and print it
        System.out.println("Removed element: " + mystack.pop());

        //Then print the stack to see the remaining elements
        System.out.println("Remaining stack: " + mystack);


        // TODO: 5 - Check if the stack is empty using isEmpty()
        System.out.println("Is stack empty? " + mystack.isEmpty());
        // Print the result



        // --- String Reversal ---
        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";
        Stack<Character> charStack = new Stack<>();
        // TODO: 6 - Use a Stack to reverse the string 'original'
        // Push each character onto a stack,
        for (int i = 0; i < original.length(); i++) {
            charStack.push(original.charAt(i));
        }

        //then pop them all to build the reversed string
        String reversed = "";

        while (!charStack.isEmpty()) {
            reversed = reversed + charStack.pop();
        }

        //Print both original and reversed strings
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);


        // --- Balanced Brackets ---
        System.out.println("\n--- Balanced Brackets ---");
        String balanced = "({[()]})";
        String unbalanced = "({[})";

        // TODO: 7 - Implement a balanced brackets checker
        // Use a Stack to check if a string of brackets is balanced
        // For each char: if opening bracket, push it; if closing bracket,
        Stack<Character> bracketStack = new Stack<>();
        //           check
        for (int i = 0; i < balanced.length(); i++) {

            char ch = balanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {

                if (bracketStack.isEmpty()) {
                    break;
                }

                char top = bracketStack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    bracketStack.push('X');
                    break;
                }
            }
        }

        System.out.println(balanced + " is balanced: " +
                bracketStack.isEmpty());
        //           that the top of stack is the matching opening bracket
        //           Test with both 'balanced' and 'unbalanced' strings
        bracketStack.clear();

        for (int i = 0; i < unbalanced.length(); i++) {

            char ch = unbalanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {

                if (bracketStack.isEmpty()) {
                    break;
                }

                char top = bracketStack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    bracketStack.push('X');
                    break;
                }
            }
        }
        //  Print whether each string is balanced or not
        System.out.println(unbalanced + " is balanced: " +
                bracketStack.isEmpty());

    }
}
