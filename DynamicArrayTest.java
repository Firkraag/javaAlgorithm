import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void add_and_get_and_size() {
        DynamicArray dynamicArray = new DynamicArray(2);
        assertEquals(0, dynamicArray.size());
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        assertEquals(3, dynamicArray.size());
        assertEquals(1, dynamicArray.get(0));
        assertEquals(2, dynamicArray.get(1));
        assertEquals(3, dynamicArray.get(2));

    }

}