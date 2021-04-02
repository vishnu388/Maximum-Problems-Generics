public class FindMaximum<T extends Comparable<T>> {
    private final T x;
    private final T z;
    private final T y;

    public FindMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T findMaximum() {
        return FindMaximum.findMaximum(x, y, z);
    }

    //Single generic method to compare different types of data
    public static <T extends Comparable> T findMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
