package com.carlab.queues;

public interface IDoubleQueue<T> extends IQueue<T> {
    void enqueueFront(T item); 

    T dequeueRear(); 
}