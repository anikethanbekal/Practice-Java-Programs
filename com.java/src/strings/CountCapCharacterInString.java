package strings;

public class CountCapCharacterInString {
	// m1 using char
	public void chars(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
	}

	// m2
	public void method(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

	// m3
	public void chars3(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = "This IS TO CheCk";
		CountCapCharacterInString count = new CountCapCharacterInString();
		count.chars(str);
		count.method(str);
		count.chars3(str);
	}
}
