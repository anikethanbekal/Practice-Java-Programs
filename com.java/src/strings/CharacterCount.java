package strings;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "Java";
		int org_len = str.length();
		String cha ="a";
		int new_len = str.replaceAll(cha, "").length();
		int diff = org_len - new_len;
		System.out.println("Occurance of char : " + cha + " is " + diff);
	}
}
