import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonAreaTest {

    @Test
    void polygonArea() {
        double[][] rectangle = {{0, 0}, {0, 2}, {2, 2}, {2, 0}};
        assertEquals(4.0, PolygonArea.polygonArea(rectangle));
        double[][] triangle = {{0, 0}, {5, 0}, {2.5, 5}};
        assertEquals(12.5, PolygonArea.polygonArea(triangle));
    }
}