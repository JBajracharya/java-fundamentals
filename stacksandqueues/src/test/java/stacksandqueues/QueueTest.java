package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        String expected = "1->2->3->4->NULL";
        String actual = queue.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();

        String expected = "2->3->4->NULL";
        String actual = queue.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void dequeueMultiple() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertNull(queue.front);
    }

    @Test
    public void peek() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.peek());
    }

    @Test
    public void isEmpty() {
        Queue queue1 = new Queue();
        queue1.enqueue(1);

        Queue queue2 = new Queue();

        assertFalse(queue1.isEmpty());
        assertTrue(queue2.isEmpty());
    }

    @Test
    public void testEmptyQueue(){
        Queue queue1 = new Queue();
        assertNull(queue1.front);
    }
}