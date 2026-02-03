import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input: Expected one string argument.");
            return;
        }

        String input = args[0];

        if (input.length() % 2 == 1) {
            System.out.println("Invalid.");
            return;
        }

        Stack<Character> list = new Stack<>();

        for (char c : input.toCharArray()) {
            System.out.println(list);

            if (c == '(') list.push(')');
            else if (c == '[') list.push(']');
            else if (c == '{') list.push('}');

            else if (list.isEmpty() || list.pop() != c) {
                System.out.println("Invalid.");
                return;
            }
        }

        System.out.println(list.empty() ? "Valid." : "Invalid.");
    }
}