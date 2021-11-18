public class ThreeStringsMax {
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
		System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));

	}

}
