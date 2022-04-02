package misc.testcases;

public class NullArgTestP3 {
	public static void main(String[] args) {
		method(false);
	}

	public static void method(String s) {
		System.out.println("String Method"); 
	}

	public static void method(Object o) {
		System.out.println("Object Method"); // output
	}
}
