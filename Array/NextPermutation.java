import java.util.Arrays;

public class NextPermutation {
    public static void reverse(int[] arr, int st, int end){
        while (st < end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
    public static void findNextPermutation(int[] nums) {
        int idx = -1; 
        int n = nums.length;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);  
            return;
        }
        for(int i = n-1; i > idx ; i--){
            if(nums[i] > nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums, idx + 1, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findNextPermutation(arr);
        System.out.println("Next permutaion is : " + Arrays.toString(arr));
    }
}
