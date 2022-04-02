package strings;

import java.util.ArrayList;
import java.util.List;

public class Substrings {
	// m1
	public void usingSubstring() {
		String s = "babad";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Substrings().usingSubstring();
	}

}
