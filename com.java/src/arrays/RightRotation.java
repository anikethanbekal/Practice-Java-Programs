package arrays;

//input : 1,2,3,4,5
//firstrotation : 5,1,2,3,4
public class RightRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n =3;
		for(int i =0;i<n;i++) {
			int last = arr[arr.length-1];
			for(int j = arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
