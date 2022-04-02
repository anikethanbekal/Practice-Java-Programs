package arrays;
/*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]*/

public class Shuffle {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		int[] num2 = new int[nums.length];
		int count =0;
		for(int i=0;i<n;i++,count++) {
			num2[count++] = nums[i];
			num2[count] = nums[i+n];
		}
		for (int i : num2) {
			System.out.println(i);
		}
	}
}
