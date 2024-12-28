public class fifthPractcie {
    public static boolean check(int[] nums) {
        int break_count = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                break_count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            break_count++;
        }
        return break_count <= 1;
    }
    public static void main(String[] args) {
        int[] nums   = {3,4,5,1,2};
        System.out.println(check(nums));
    }

}
