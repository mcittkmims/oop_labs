package com.carlab.queues;

public interface IQueue<T> {
    void enqueue(T item); 

    T dequeue(); 

    T peek(); 

    boolean isEmpty(); 

    int size(); 
}

