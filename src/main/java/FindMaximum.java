public class FindMaximum<T extends Comparable<T>> {
    private final T p;
    private final T q;
    private final T r;
    private final T s;
    private final T t;

    public FindMaximum(T p, T q, T r, T s, T t) {
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }

    public T findMaximum() {
        T findMax = FindMaximum.findMaximum(p, q, r, s, t);
        printMax(findMax);
        return findMax;
    }

    //Single generic method to compare different types of data
    public static <T extends Comparable> T findMaximum(T p, T q, T r, T s, T t) {
        T max = p;
        if (q.compareTo(max) > 0) {
            max = q;
        }
        if (r.compareTo(max) > 0) {
            max = r;
        }
        if (s.compareTo(max) > 0) {
            max = s;
        }
        if (t.compareTo(max) > 0) {
            max = t;
        }
        return max;
    }

    public void printMax(T maximum) {
        System.out.println("Maximum : " + maximum);
    }
}
