package com.example.stack;

public class Main {

    public static void main(String[] args) {
        // Test ArrayStack with Integer
        Stack<Integer> intStackArray = new ArrayStack<>();
        intStackArray.push(10);
        intStackArray.push(20);
        intStackArray.push(30);
        System.out.println("ArrayStack (Integer) Pop: " + intStackArray.pop());
        System.out.println("ArrayStack (Integer) Peek: " + intStackArray.peek());
        System.out.println("ArrayStack (Integer) Is Empty: " + intStackArray.isEmpty());

        // Test LinkedListStack with Integer
        Stack<Integer> intStackLinkedList = new LinkedListStack<>();
        intStackLinkedList.push(10);
        intStackLinkedList.push(20);
        intStackLinkedList.push(30);
        System.out.println("\nLinkedListStack (Integer) Pop: " + intStackLinkedList.pop());
        System.out.println("LinkedListStack (Integer) Peek: " + intStackLinkedList.peek());
        System.out.println("LinkedListStack (Integer) Is Empty: " + intStackLinkedList.isEmpty());

        // Test ArrayStack with String
        Stack<String> stringStackArray = new ArrayStack<>();
        stringStackArray.push("Apple");
        stringStackArray.push("Banana");
        stringStackArray.push("Cherry");
        System.out.println("\nArrayStack (String) Pop: " + stringStackArray.pop());
        System.out.println("ArrayStack (String) Peek: " + stringStackArray.peek());
        System.out.println("ArrayStack (String) Is Empty: " + stringStackArray.isEmpty());

        // Test LinkedListStack with String
        Stack<String> stringStackLinkedList = new LinkedListStack<>();
        stringStackLinkedList.push("Apple");
        stringStackLinkedList.push("Banana");
        stringStackLinkedList.push("Cherry");
        System.out.println("\nLinkedListStack (String) Pop: " + stringStackLinkedList.pop());
        System.out.println("LinkedListStack (String) Peek: " + stringStackLinkedList.peek());
        System.out.println("LinkedListStack (String) Is Empty: " + stringStackLinkedList.isEmpty());
    }
}
