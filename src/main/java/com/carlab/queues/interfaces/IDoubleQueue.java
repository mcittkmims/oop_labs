package com.carlab.queues.interfaces;

public interface IDoubleQueue<T> extends IQueue<T> {
    void enqueueFront(T item); 

    T dequeueRear(); 
}