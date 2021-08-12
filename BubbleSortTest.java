import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Integer[] array1 = new Integer[100];
            for (int j = 0; j < 100; j++) {
                array1[j] = random.nextInt();
            }
            Integer[] array2 = Arrays.copyOf(array1, array1.length);
            Arrays.sort(array1);
            BubbleSort.bubbleSort(array2);
            assertArrayEquals(array1, array2);

            Double[] array3 = new Double[100];
            for (int j = 0; j < 100; j++) {
                array3[j] = random.nextDouble();
            }
            Double[] array4 = Arrays.copyOf(array3, array3.length);
            Arrays.sort(array3);
            BubbleSort.bubbleSort(array4);
            assertArrayEquals(array3, array4);
        }
    }
}