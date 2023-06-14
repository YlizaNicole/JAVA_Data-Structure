package Parentheses_Checker;

import java.util.*;

public class Main {

    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sets for parentheses: " + ANSI_BLUE);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.print(ANSI_RESET + "Enter the parenthese/s: " + ANSI_BLUE);
            String parentheses = scanner.nextLine();
            System.out.println(
                    isBalanced(parentheses) ? ANSI_GREEN + "BALANCED" : ANSI_RED + "NOT BALANCED" + ANSI_RESET);
        }

        scanner.close();
    }

    private static boolean isBalanced(String parentheses) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty() || (ch == ')' && stack.pop() != '(') || (ch == '}' && stack.pop() != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}