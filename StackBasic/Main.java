package StackBasic;

public class Main {

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + ANSI_GREEN + stack.peek() + ANSI_RESET);
        stack.pop();
        System.out.println("Top element: " + ANSI_RED + stack.peek() + ANSI_RESET);
    }
}

class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    // Add element to top of stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            top--;
        }
    }

    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No top element.");
            return -1; // return a default value for an empty stack
        } else {
            return stackArray[top];
        }
    }
}