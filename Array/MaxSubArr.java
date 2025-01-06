public class MaxSubArr {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 0; i < n; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The largest sum is : " + maxSubArray(arr));
    }
    
}
