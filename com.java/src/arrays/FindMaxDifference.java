package arrays;

public class FindMaxDifference {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 3, 7, 8, 9 };
		int maxDiff = arr[1] - arr[0];

		int minEle = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] - minEle) > maxDiff) {
				maxDiff = arr[i] - minEle;
			}
			if (arr[i] < minEle) {
				minEle = arr[i];
			}
		}
		System.out.println(maxDiff);
	}
}
