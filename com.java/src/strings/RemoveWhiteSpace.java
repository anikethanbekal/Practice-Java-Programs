package strings;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "       This is a string             ";

		// to remove space at start and end of the string
		System.out.println(str.trim());

		// to remove space in entire string 
		System.out.println(str.replaceAll("\\s", ""));
	}
}
