package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//num = {2,7,11,15} target =18
//num[1]+num[2] = 7+11 = 18
//return [1,2]
public class TwoSum {
	// m1 : brute force approach
	static int[] bruteForce(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == (target - arr[i])) {
					return new int[] { i, j };
				}
			}

		}
		throw new IllegalArgumentException("No Pair Found");
	}

	// m2 : hashmap
	static int[] hashmap(int arr[], int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			numMap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			int numToFind = target - arr[i];
			if (numMap.containsKey(numToFind) && numMap.get(numToFind) != i) {
				return new int[] { i, numMap.get(numToFind) };
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 18;
		// int[] temp = bruteForce(arr, target);

		int[] temp = hashmap(arr, target);

		for (int i : temp) {
			System.out.println(i);
		}
	}
}
