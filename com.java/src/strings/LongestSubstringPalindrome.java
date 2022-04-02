package strings;

public class LongestSubstringPalindrome {
	void subStr(String str) {
		int max = 0;
		for(int i = 0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String sub = str.substring(i,j);
				if(sub.length()>1) {
					boolean flag = checkPalin(sub);
					if(flag) { 
						if(sub.length()>max) {
							System.out.println(sub);
						}else {
							continue;
						}	
					}
				}
			}
		}
	}
	boolean checkPalin(String sub) {
		String str = sub;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		if (rev.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		new  LongestSubstringPalindrome().subStr("MADAM");
	}
}
