public class findMaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,1,0,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
    
}
