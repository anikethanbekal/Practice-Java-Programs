package strings;

public class CountWords {
	public static void main(String[] args) {
		String str = "This is Java";
		int count = 1;
		if (str.isEmpty()) {
			count = 0;
		} else {
			for (int i = 0; i < str.length() - 1; i++) {
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}