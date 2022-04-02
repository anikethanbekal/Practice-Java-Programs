package misc.testcases;

//in the below example only main method withString[] will be executed
//since JVM will search for the method signature of String[], here args can be replaced by any value)
//if others need to executed then it should be called in main method
// we can call main method of any other class by classname and method name since its static
// if we call in recurrsion it will be stackoverflow error
//in String[] if [] is removed then it will not be executed run as java application change to run configuration

public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("String[]");
	}

	public static void main(String args) {
		System.out.println("String");
	}

	public static void main(int args) {
		System.out.println("int");
	}

}
