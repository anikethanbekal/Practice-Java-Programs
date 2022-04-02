package arrays;

import java.util.Arrays;

public class CompareArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		if (arr1 == arr2)
			; // false
		if (Arrays.equals(arr1, arr2))
			; // true

		// To check deepequals
		int inarr1[] = { 1, 2, 3 };
		int inarr2[] = { 1, 2, 3 };
		Object arr11[] = { inarr1 };
		Object arr22[] = { inarr2 };
		if (inarr1 == inarr2)
			; // false
		if (Arrays.equals(inarr1, inarr2))
			; // true

		// m2
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };
		boolean isStatus = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					isStatus = false;
				}
			}
		}
		if (isStatus) {
			System.out.println("Its equal");
		}
		
	}
}
