package strings;

import java.util.List;
import java.util.ArrayList;

/***
 * Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
 * Input: s = "cbbd" Output: "bb"
 *
 */
public class LongestPalindromicSubString {

	/*
	 * public static void main(String[] args) { String s = "babad"; List<String> ls
	 * = new ArrayList<String>(); for (int i = 0; i < s.length(); i++) { for (int j
	 * = i + 1; j <= s.length(); j++) { ls.add(s.substring(i, j)); } } int max =
	 * Integer.MIN_VALUE; int len = Integer.MIN_VALUE; String word = ""; for (int i
	 * = 0; i < ls.size(); i++) { if (ls.get(i).length() == 0) { continue; } else {
	 * if (checkPal(ls.get(i))) { len = ls.get(i).length(); if (len > max) { word =
	 * ls.get(i); } } } } System.out.println(word);
	 * 
	 * }
	 * 
	 * // check palindrome public static boolean checkPal(String str) { String temp
	 * = ""; String rev = ""; for (int i = str.length() - 1; i >= 0; i--) { rev +=
	 * str.charAt(i); } if (rev.equals(str)) { return true; } else { return false; }
	 * }
	 */
}
