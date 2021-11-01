package arrays;

//Q arr = {1,2,3,4,5,6,7} sum =9 
//A [7,2] , [6,3] , [5,4]
public class FindPairsWithGivenSumSortedArray {
	public static void main(String[] args) {
		// here we capture since array in sorted first and last index is captured and
		// calculate
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 9;
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] > sum) {
				high--;
			} else if (arr[low] + arr[high] < sum) {
				low++;
			} else if (arr[low] + arr[high] == sum) {
				System.out.println(arr[low] + ":" + arr[high]);
				low++;
				high--;
			}
		}
	}
}
