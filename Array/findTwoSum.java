import java.util.ArrayList;

public class findTwoSum {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        int n = nums.length;
        // for(int i = 0; i < n; i++){
        //    for(int j = i+1; j < n; j++){
        //     if(nums[i]+nums[j] == target){
        //         return new int[]{i, j};
        //     }
        //    }
        // }
        // return new int[]{-1,-1};
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i <n; i++){
            for(int j = i+1; j <n; j++){
                if(nums[i]+nums[j] == target){
                    result.add(i);
                    result.add(j);
                } 
            }
        }
                return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        // int[] result = twoSum(nums, 15);
        // System.out.println(result[0] + "," + result[1]);
        ArrayList<Integer> result = twoSum(nums, 18);
        System.out.println(result);
    }
}
