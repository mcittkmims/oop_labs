package com.carlab.queues.interfaces;

import org.junit.jupiter.api.Test;

import com.carlab.queues.DoubleQueue;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleQueueTest {

    @Test
    public void testDoubleEndedOperations() {
        DoubleQueue<String> deque = new DoubleQueue<>();

        // Test enqueueFront and dequeueRear
        deque.enqueueFront("A");
        deque.enqueueFront("B");
        assertEquals("A", deque.dequeueRear());
        assertEquals("B", deque.dequeueRear());

        // Test enqueue (rear) and dequeue (front)
        deque.enqueue("X");
        deque.enqueue("Y");
        assertEquals("X", deque.dequeue());
        assertEquals("Y", deque.dequeue());
    }
}