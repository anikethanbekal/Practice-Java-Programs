package arrays;

import java.util.Arrays;

//IP : {0,1,0,0,0,1,1,0}
//OP : {0,0,0,0,0,1,1,1]}
public class Segregate {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 0, 1, 1, 0 };
		int j = 0;
		// loop to store 0 to left
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[j++] = arr[i];
			}
		}
		// to store 1 to right
		while (j < arr.length) {
			arr[j++] = 1;
		}

		System.out.println(Arrays.toString(arr));
	}
}
