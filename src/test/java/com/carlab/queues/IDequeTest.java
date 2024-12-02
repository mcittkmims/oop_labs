package com.carlab.queues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IDequeTest {

    @Test
    public void testDoubleEndedOperations() {
        IDoubleQueue<String> deque = new DoubleQueue<>();

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