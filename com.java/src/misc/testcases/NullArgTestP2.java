package misc.testcases;

/*In the below case we get cte at method(null) cox both are non-primitive type and both accepts null
so the compiler gets confuse between them so to avoid this use
*/

public class NullArgTestP2 {

	public static void main(String[] args) {
		// method(null); //Cte

		// to avoid cte above use below code
		Integer i = null;
		method(i);
	}

	public static void method(String s) {
		System.out.println("String Method"); 
	}

	public static void method(Integer i) {
		System.out.println("Integer Method"); // output
	}

}
