package arrays;
/*Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]*/

//not done
public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val=3;
        int out[] = new int[nums.length];
        int len = nums.length-1;
        int a =0 ;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==val){
                out[len] = 0;
                len--;
            }else{
                out[a++] = nums[i];
            }
        }
        for (int b: out
             ) {
            System.out.println(b);
        }

    }
}
