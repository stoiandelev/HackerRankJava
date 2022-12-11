package medium;

import java.util.Scanner;
import java.util.Stack;

//Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
//Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
//input
//{}()
//({()})
//{}(
//[]

public class Task6_Stack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            //Complete the code
            Stack<Character> stack = new Stack<>();
            for (char character : input.toCharArray()) {
                if (!stack.isEmpty()) {
                    if (character == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (character == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (character == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else stack.push(character);
                } else {
                    stack.push(character);
                }
            }

            System.out.println(stack.isEmpty());
        }
    }
}
