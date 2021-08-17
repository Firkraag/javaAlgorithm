import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    void gcd() {
        assertEquals(Gcd.gcd(10, 3), 1);
        assertEquals(Gcd.gcd(10, 4), 2);
        assertEquals(Gcd.gcd(10, 1), 1);
        assertEquals(Gcd.gcd(10, 5), 5);
    }
}