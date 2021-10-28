package strings;

import com.google.common.base.CharMatcher;

public class CountVowelUsingGoogleGuava {
	public static void main(String[] args) {
		String str = "This string is to check vowels";
		int count = CharMatcher.anyOf("aeiou").countIn(str);
		System.out.println(count);
	}
}
