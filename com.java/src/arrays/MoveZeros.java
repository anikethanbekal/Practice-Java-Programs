package arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int nums[] = {0,1,2,6,5,0};
		if (nums == null || nums.length == 0) return;
		
		int curr = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp = nums[curr];
				nums[curr] = nums[i];
				nums[i] = temp;
				curr++;
			}
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
	}
}
