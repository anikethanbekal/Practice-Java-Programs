package arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 5, 3 };

		// m1
		Arrays.parallelSort(a);

		// m2
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		// reverse order
		Integer b[] = { 30, 40, 80, 70, 20 };
		Arrays.sort(b, Collections.reverseOrder()); // here collections take object type hence Integer.
		System.out.println(Arrays.toString(b));
	}
}
