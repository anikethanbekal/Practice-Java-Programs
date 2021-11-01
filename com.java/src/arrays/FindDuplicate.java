package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 9, 1 };
		
		//here set is used coz it doesnt stoe duplicates
		Set<Integer> uniqueNum = new HashSet<Integer>();
		boolean isDuplicate = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (uniqueNum.contains(arr[i])) {
				isDuplicate = true;
				System.out.println(arr[i]);
			} else {
				uniqueNum.add(arr[i]);
			}
		}
		
		if (!isDuplicate) {
			System.out.println("No Duplicates");
		}
	}
}
