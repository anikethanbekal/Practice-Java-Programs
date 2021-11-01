package misc;

public class IsStringIsNumber {

	public static void main(String[] args) {
		String isNum = "123456";
		// m1 :using long
		try {
			Long.parseLong(isNum); // will get number format exception
			System.out.println("Is a number");

		} catch (NumberFormatException e) {
			System.out.println("Is not a number");
		}

		// m2 : using matches or regex
		System.out.println(isNum.matches("[0-9]+"));
	}

}
