public class mergeTwoSortedArray
{
    public static void merge(int[] arr1,int[] arr2){
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;
        int new_len = arr1_len+arr2_len;
        int[] out = new int[new_len];
        for(int i =0;i<arr1_len;i++){
            out[i] = arr1[i];
        }
        for(int i=0;i<arr2_len;i++){
            out[arr1_len+i] = arr2[i];
        }
        for(int a: out){
            System.out.println(a);
        }
        
    }
	public static void main(String[] args) {
	    int[] arr1 = {1,2,3,4};
	    int[] arr2 = {10,20,50,101};
		merge(arr1,arr2);
	}
}
