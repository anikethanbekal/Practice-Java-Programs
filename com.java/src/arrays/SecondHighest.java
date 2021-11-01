package arrays;

public class SecondHighest {
	// here m1 is same as previous for lowest . i have done only one method
	public static void main(String[] args) {
		int num[] = { 1, 2, -10, 25, 90, 101 };
		int n = num.length;
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (num[i] > highest) {
				secondhighest = highest;
				highest = num[i];
			}
			if (num[i] < highest && num[i] > secondhighest) {
				secondhighest = num[i];
			}
		}
		System.out.println(secondhighest);
	}
}
