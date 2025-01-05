public class fifthPractcie {
    public static void swap(int[] nums, int st, int end){
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
    }
    public static void sortColors(int[] nums) {
        int st = 0, end = nums.length-1;
        while(st<=end){
           if(nums[st] == 0){
            st++;
           } else if(nums[end] == 2){
            end--;
           } else if(nums[st] != 0 && nums[end] == 0){
            swap(nums, st, end);
            st++;
           } else if(nums[st] == 2 && nums[end] != 2){
            swap(nums, st, end);
            end--;
           } else {
            st++;
           }
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        sortColors(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
