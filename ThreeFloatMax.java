
public class ThreeFloatMax {
	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a; // assume x is initially the largest

		if (b.compareTo(max) > 0)
			max = b; // y is the largest so far

		if (c.compareTo(max) > 0)
			max = c; // z is the largest

		return max; // returns the largest object
	} // end method maximum

	public static void main(String args[]) {
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 8.5, 9.6, 10.2, maximum(8.5, 9.6, 10.2));

	}

}

