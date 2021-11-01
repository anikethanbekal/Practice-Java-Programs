package arrays;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };

		// m1
		boolean status = Arrays.equals(a, b);
		System.out.println(status);

		// m2
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
