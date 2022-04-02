package numbers;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 1534236469;
		int sign =1;
		if(num<0) {
			sign = -1;
			num = sign*num;
		}
		if(sign * num >Integer.MAX_VALUE || sign*num<Integer.MIN_VALUE) {
			System.out.println(0);
		}
		int revNumber = 0;
		int temp = num;
		while (temp > 0) {
			int lastDigi = temp % 10;
			revNumber = revNumber * 10 + lastDigi;
			temp = temp / 10;
		}
		System.out.println(sign * revNumber);
		
	}
}
