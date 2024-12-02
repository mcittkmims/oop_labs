package com.carlab.queues.interfaces;

public interface IQueue<T> {
    void enqueue(T item); 

    T dequeue(); 

    T peek(); 

    boolean isEmpty(); 

    int size(); 
}

