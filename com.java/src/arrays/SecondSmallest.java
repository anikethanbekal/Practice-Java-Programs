package arrays;

import java.util.Arrays;

public class SecondSmallest {
	// m1 : Using sort
	// Note: This method will not give proper o/p if duplicates are present
	static void sort(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

	// m2
	static void small(int arr[]) {
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			}
			if (arr[i] > firstSmallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(secondSmallest);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 250, 10, 75 };
		sort(arr);
		small(arr);
	}
}
