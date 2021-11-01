package strings;

import org.apache.commons.lang3.StringUtils;

public class CountOccuranceOfCharacter {
	// m1 : using charArray loops
	public void charArray(String str, char c) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == c) {
				count++;
			}
		}
		System.out.println("Ocurrance of " + c + " in " + '"' + str + '"' + " is : " + count);
	}

	// m2 : using charAt loops
	public void charAt(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Ocurrance of " + c + " in " + '"' + str + '"' + " is : " + count);
	}

	// m3 : using stringutils from apache
	//for this import apache common lang jar
	public void stringUtils(String str, char c) {
		int count = StringUtils.countMatches(str, c);
		System.out.println("Ocurrance of " + c + " in " + '"' + str + '"' + " is : " + count);
	}

	public static void main(String[] args) {
		String str = "Code for coders";
		char c = 'o';
		CountOccuranceOfCharacter count = new CountOccuranceOfCharacter();
		count.charArray(str, c);
		count.charAt(str, c);
		count.stringUtils(str, c);

	}
}
