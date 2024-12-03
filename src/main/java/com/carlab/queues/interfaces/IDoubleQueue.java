package com.carlab.queues.interfaces;

public interface IDoubleQueue<T> extends Queue<T> {
    void enqueueFront(T item); 

    T dequeueRear(); 
}