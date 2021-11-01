package arrays;

import java.util.Arrays;

public class ConvertArrayToString {
	public static void main(String[] args) {
		boolean[] bool = new boolean[] { true, false, true, true };
		String arr = Arrays.toString(bool);
		System.out.println(arr);
	}
}
