package arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1 };
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) { 
				try {
					map.put(nums[i], (map.getOrDefault(nums[i], 0) + 1));
				} catch (NullPointerException e) {
					System.out.println(i);
				}

			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				count += entry.getKey();
			}
		}
		 System.out.println(count);
	}
}
