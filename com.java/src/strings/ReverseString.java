package strings;

public class ReverseString {

	// m1 using toCharArray
	public void toCharArray(String str) {
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	// m2 using charAt
	public void charAt(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	// m3 using string buffer reverse method
	public void stringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	// m4 using string builder using reverse method
	public void stringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		ReverseString revStr = new ReverseString();
		revStr.toCharArray("This");
		System.out.println("----------------");
		revStr.charAt("THis");
		System.out.println("----------------");
		revStr.stringBuffer("THis");
		System.out.println("----------------");
		revStr.stringBuilder("THis");
	}

}
