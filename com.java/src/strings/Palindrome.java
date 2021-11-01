package strings;

public class Palindrome {
	public static void main(String[] args) {
		String str = "MADAM";
		String newStr = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		if (rev.equals(newStr)) {
			System.out.println("Its a Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
}
