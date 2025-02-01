public class rotatedSortedArrayCheck {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int break_count = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                break_count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            break_count++;
        }
        return break_count <= 1;
      }
      public static void main(String[] args) {
        int[] a = {2,1} ;
        System.out.println(check(a));
      }
}
