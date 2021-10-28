package strings;

public class FindLengthWithoutLength {
	public static void main(String[] args) {
		String str = "This is string";
		
		//m1
		System.out.println(str.lastIndexOf(""));
		
		//m2
		System.out.println(str.split("").length);
	
		//m3
		int count =0;
		for(char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		//m4
		int i = 0;
		try {
			while(true) {
				str.charAt(i);
				i++;
			}
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(i); //return i;
		}
		
	}
}
