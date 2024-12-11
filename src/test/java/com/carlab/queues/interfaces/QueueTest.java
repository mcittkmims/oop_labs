package com.carlab.queues.interfaces;


import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import com.carlab.queues.LinearQueue;
import com.carlab.queues.CircularQueue;
import com.carlab.queues.DoubleQueue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) 
public class QueueTest {

    // Method to provide instances of different Queue implementations
    private Stream<Queue<String>> queueProvider() {
        return Stream.of(
                new LinearQueue<>(), 
                new CircularQueue<>(5),
                new DoubleQueue<>()        
        );
    }

    @ParameterizedTest
    @MethodSource("queueProvider")
    public void testEnqueueAndDequeue(Queue<String> queue) {
        queue.enqueue("A");
        queue.enqueue("B");

        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
    }

    @ParameterizedTest
    @MethodSource("queueProvider")
    public void testPeek(Queue<String> queue) {
        queue.enqueue("A");

        assertEquals("A", queue.peek());
        assertEquals("A", queue.peek()); 
    }

    @ParameterizedTest
    @MethodSource("queueProvider")
    public void testIsEmpty(Queue<String> queue) {
        assertTrue(queue.isEmpty());

        queue.enqueue("A");
        assertFalse(queue.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("queueProvider")
    public void testSize(Queue<String> queue) {
        assertEquals(0, queue.size());

        queue.enqueue("A");
        queue.enqueue("B");

        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }
}
