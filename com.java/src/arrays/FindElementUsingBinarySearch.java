package arrays;

import java.util.Arrays;

public class FindElementUsingBinarySearch {
	public static void main(String[] args) {
		// m1 array should be in sorted order
		int a[] = { 1, 2, 3, 4, 5 };
		boolean flag = false;
		int key = 5;
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Found");
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = m + 1;
			}
			if (a[m] > key) {
				h = m - 1;
			}
		}

		// m2 using method
		System.out.println(Arrays.binarySearch(a, key));// return index of found element
	}
}
