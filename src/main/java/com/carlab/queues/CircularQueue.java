package com.carlab.queues;

import com.carlab.queues.interfaces.Queue;

public class CircularQueue<T> implements Queue<T> {
    private final T[] data; 
    private final int capacity; 
    private int front; 
    private int rear; 
    private int size; 

    
    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(T item) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        data[rear] = item;
        rear = (rear + 1) % capacity; // Wrap around
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = data[front];
        data[front] = null;
        front = (front + 1) % capacity; // Wrap around
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
