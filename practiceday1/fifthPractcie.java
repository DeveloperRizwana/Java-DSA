public class fifthPractcie {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        int previousNum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(previousNum != nums[i]){
                previousNum = nums[i];
                nums[k++] = nums[i];
            }
        }
        return k;
    }
       public static void main(String[] args) {
        int[] nums   = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + result);

        // Print the unique elements
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    }
