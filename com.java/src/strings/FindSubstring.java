package strings;

public class FindSubstring {
	public static void main(String[] args) {
		String str = "To Find Substring";
		String sub = "Sub";

		// m1
		System.out.println(str.matches("(.*)" + sub + "(.*)")); // true

		// m2
		System.out.println(str.contains(sub)); // true

		// m3
		System.out.println(str.indexOf(sub) != -1); // true
	}
}
