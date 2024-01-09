package Pradeep;

import java.util.EmptyStackException;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is full. Cannot push element.");
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Size of stack: " + stack.size());  // Output: 5

        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped element: " + element);
        }
        // Output:
        // Popped element: 50
        // Popped element: 40
        // Popped element: 30
        // Popped element: 20
        // Popped element: 10

        System.out.println("Size of stack: " + stack.size());  // Output:
}
}

