package arrays;
/*Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]*/

public class Concatination {
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		int[] num2 = new int[nums.length*2];
		for(int i = 0;i<nums.length;i++) {
			num2[i] = nums[i];
			num2[i+nums.length] = nums[i];
		}
	}
}
