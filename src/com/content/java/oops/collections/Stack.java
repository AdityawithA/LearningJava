package com.content.java.oops.collections;// Basic Stack Implementation in Java

class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Nothing to pop.");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println("pop:"+stack.pop());
        System.out.println("pop:" +stack.pop());
        stack.push(69);
        stack.display();
    }
}
