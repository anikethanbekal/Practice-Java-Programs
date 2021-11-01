package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedArray {
	// m1 sorting
	static void sort(int arr[]) {
		Arrays.sort(arr);
		int len = arr.length;
		int j = 0;
		for (int i = 0; i < len - i; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len - 1];
	}

	// m2 hashmap
	static void hashMap(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		// print
		map.forEach((k, v) -> System.out.println(k + " "));
	}

	// m3 using set
	static void set(int arr[]) {
		Set set = new HashSet();
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			set.add(arr[i]);
		}
		// print
		set.forEach(elem -> System.out.println(elem + " "));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 7, 8, 15, 1, 18, 3, 45, 2, 15 };
		// sort(arr);
		// System.out.println(Arrays.toString(arr));
		// hashMap(arr);
		set(arr);
	}
}
