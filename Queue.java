class EmptyException extends Exception {
}

class FullException extends Exception {
}

public class Queue {
    private final int[] data;
    private final int size;
    private int head;
    private int tail;

    public Queue(int size) {
        data = new int[size];
        this.size = size;
        head = 0;
        tail = 0;
    }

    public void enqueue(int element) throws FullException {
        if (isFull()) {
            throw new FullException();
        }
        data[tail] = element;
        tail = (tail + 1) % size;
    }

    public int dequeue() throws EmptyException {
        if (isEmpty()) {
            throw new EmptyException();
        }
        int result = data[head];
        head = (head + 1) % size;
        return result;
    }

    public int capacity() {
        return size - 1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
