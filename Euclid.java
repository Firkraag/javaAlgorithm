public class Euclid {
    public static int euclid(int a, int b) {
        if (0 == b) {
            return a;
        }
        return euclid(b, a % b);
    }
}
