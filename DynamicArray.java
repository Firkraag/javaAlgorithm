import java.util.Arrays;

public class DynamicArray {
    private int capacity;
    private int size;
    private int[] data;

    public DynamicArray(int capacity) {
        assert capacity > 0;
        this.capacity = capacity;
        size = 0;
        data = new int[capacity];
    }

    public void add(int element) {
        if (size >= capacity) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[size++] = element;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];
    }
}
