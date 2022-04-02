package misc.testcases;

/*
 * From static
	From Test Main
	from non static
	From constructor
 */
public class ExecutionOrder {
	static {
		System.out.println("From static");
	}
	{
		System.out.println("from non static");
	}

	ExecutionOrder() {
		System.out.println("From constructor");
	}

	public static void main(String[] args) {
		System.out.println("From Test Main");
		new ExecutionOrder();
	}
}
