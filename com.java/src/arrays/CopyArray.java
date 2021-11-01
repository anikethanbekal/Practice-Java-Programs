package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class CopyArray {
	// m1 : forloop
	public void copyByLoop(int[] arr) {
		int outArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			outArr[i] = arr[i];
			
		}

		for (int a : outArr) {
			System.out.println(a);
		}
	}
	
	//m2 : using copy method
	public void copy(int[] arr) {
		
		int[] outArr = Arrays.copyOf(arr, arr.length);
		for (int a : outArr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3 };
		CopyArray copy = new CopyArray();
		copy.copyByLoop(arr);
		System.out.println("-------------------");
		copy.copy(arr);

	}

}
