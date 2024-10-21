package com.example.stack;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2); // Double the array size
        }
        array[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return array[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
