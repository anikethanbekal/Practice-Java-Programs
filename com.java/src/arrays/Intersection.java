package arrays;

import java.util.HashSet;

public class Intersection {
	// m1 using loops O(mn)
	static void loop(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	// m2 using two index O(m+n)
	static void index(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
		}
	}

	// m3 using hashset
	static void hashset(int arr1[], int arr2[]) {
		HashSet<Integer> set1 = new HashSet<>();
		for (int val : arr1) {
			set1.add(val);
		}
		for (int val : arr2) {
			if (set1.contains(val)) {
				System.out.println(val);
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 4, 5, 6, 7 };
		// loop(arr1, arr2);
		// index(arr1, arr2);
		hashset(arr1, arr2);
	}
}
