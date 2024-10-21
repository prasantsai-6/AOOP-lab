package com.example.stack;

public class LinkedListStack<T> implements Stack<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    @Override
    public void push(T element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
