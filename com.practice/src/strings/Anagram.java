package strings;

import java.util.Arrays;

//eg for anagram is Listen and Silent
public class Anagram {

	public boolean isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", ""); // space removing
		String str2 = s2.replaceAll("\\s", ""); // space removing

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char char1[] = str1.toLowerCase().toCharArray();
			char char2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			return Arrays.equals(char1, char2);
		}
	}

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		Anagram anagram = new Anagram();
		boolean isAna = anagram.isAnagram(s1, s2);
		System.out.println(isAna);
	}

}
