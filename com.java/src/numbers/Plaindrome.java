package numbers;

public class Plaindrome {
	public static void main(String[] args) {
		int num =1231;
		int revNumber = 0;
		int temp =num;
		while(temp>0) {
			int lastDigi = temp%10;
			revNumber = revNumber *10+ lastDigi;
			temp =temp/10;
			
		}
		if(revNumber == num) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
