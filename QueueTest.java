import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue_and_dequeue() throws FullException, EmptyException {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        assertThrows(FullException.class, () -> queue.enqueue(3));
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertThrows(EmptyException.class, queue::dequeue);
    }

    @Test
    void capacity() {
        Queue queue = new Queue(5);
        assertEquals(4, queue.capacity());
    }

    @Test
    void isFull() throws FullException {
        Queue queue = new Queue(2);
        queue.enqueue(1);
        assertTrue(queue.isFull());
        queue = new Queue(1);
        assertTrue(queue.isFull());
    }

    @Test
    void isEmpty() {
        Queue queue = new Queue(2);
        assertTrue(queue.isEmpty());
    }
}