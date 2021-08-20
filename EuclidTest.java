import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuclidTest {

    @Test
    void gcd() {
        assertEquals(Euclid.euclid(10, 3), 1);
        assertEquals(Euclid.euclid(10, 4), 2);
        assertEquals(Euclid.euclid(10, 1), 1);
        assertEquals(Euclid.euclid(10, 5), 5);
    }
}