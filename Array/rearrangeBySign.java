import java.util.Arrays;
public class rearrangeBySign {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positiveIdx = 0, negativeIdx = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result[positiveIdx] = nums[i];
                positiveIdx += 2;
            } else {
                result[negativeIdx] = nums[i];
                negativeIdx += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1};
        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
