package com.carlab.queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import com.carlab.queues.interfaces.IQueue;

public class LinearQueue<T> implements IQueue<T> {
    private LinkedList<T> list; 

    
    public LinearQueue() {
        list = new LinkedList<>();
    }

    // Add an item to the end of the queue
    @Override
    public void enqueue(T item) {
        list.addLast(item); 
    }

    // Remove and return the item from the front of the queue
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst(); 
    }

    // Return the item at the front without removing it
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst(); 
    }

    // Check if the queue is empty
    @Override
    public boolean isEmpty() {
        return list.isEmpty(); 
    }

    // Get the size of the queue
    @Override
    public int size() {
        return list.size();
        
    }
}