package strings;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "T!@#hi()(s is t*(*(^he st*(^$#@$%ring";
		String pstr = str.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(pstr);
	}
}