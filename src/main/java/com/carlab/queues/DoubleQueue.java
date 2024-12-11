package com.carlab.queues;

import java.util.LinkedList;

import com.carlab.queues.interfaces.IDoubleQueue;

public class DoubleQueue<T> implements IDoubleQueue<T> {
    private LinkedList<T> deque = new LinkedList<>();

    // Add to the rear
    @Override
    public void enqueue(T item) {
        deque.addLast(item); 
    }

    // Remove from the front (standard queue behavior)
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.removeFirst(); 
    }

    // Peek at the front
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.getFirst(); 
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public int size() {
        return deque.size();
    }

    // Add to the front
    @Override
    public void enqueueFront(T item) {
        deque.addFirst(item); // Add to the front
    }

    // Remove from the rear
    @Override
    public T dequeueRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeLast(); // Remove from the rear
    }
}

