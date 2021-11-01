package strings;

public class ReverseEachWord {
	//m1 using loops
	public void loops(String str) {
		
		String[] words = str.split(" ");
		String reversestring = "";
		for(String w : words) {
			String reversewords ="";
			for(int i=w.length()-1; i>=0;i--) {
				reversewords +=w.charAt(i);
			}
			reversestring +=reversewords + " ";
		}
		
		System.out.println(reversestring);
	}
	
	//m2 : using builtin methods
	public void builtin(String str) {
		String[] words = str.split(" ");
		String rev = "";
		for(String w : words) {
			
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			rev += sb.toString() + " ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		String str = "This is a string value";
		ReverseEachWord rev = new ReverseEachWord();
		rev.loops(str);
		rev.builtin(str);
	}
	
}