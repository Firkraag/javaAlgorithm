public class PolygonArea {
    public static double polygonArea(double[][] polygon) {
        assert polygon.length > 0 && polygon[0].length == 2;
        double area = 0.0;
        for (int i = 0; i < polygon.length - 1; i++) {
            area += (polygon[i][0] + polygon[i + 1][0]) * (polygon[i + 1][1] - polygon[i][1]);
        }
        area += (polygon[0][0] + polygon[polygon.length - 1][0]) * (polygon[0][1] - polygon[polygon.length - 1][1]);
        if (area > 0) {
            return 0.5 * area;
        }
        else {
            return 0.5 * -area;
        }
    }
}
