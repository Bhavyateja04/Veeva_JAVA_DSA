// 2. Valid Parentheses
// Easy
//  Stack

// Problem statement
// Given a string containing only the following brackets:
// - ()
// - {}
// - []
// Determine whether the input string has valid parentheses.

// A string is valid if:
// 1. Every opening bracket has a corresponding closing bracket.
// 2. Brackets are closed in the correct order.
// 3. Every closing bracket matches the most recent unmatched opening bracket.
// Example 1:
// Input:  "()[]{}"
// Output: true


// Example 2:
// Input:  "([)]"
// Output: false


// Example 3:
// Input:  "{[]}"
// Output: true


// Approach: Stack
// A Stack follows LIFO (Last In, First Out).
// 1. If an opening bracket appears, push it into the stack.
// 2. If a closing bracket appears:
//    - Check whether the stack is empty.
//    - Pop the top element.
//    - Verify whether the brackets match.
// 3. At the end, if the stack is empty, the string is valid.

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input = "{[]}";

        if (isValid(input)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
