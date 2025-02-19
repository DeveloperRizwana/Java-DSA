import java.util.HashMap;

public class findMajorityElement {
    public static int majorityElement(int[] nums) {
        // int count = 0, number = nums[0];
        // for(int i = 0; i<nums.length; i++){
        //     if(count == 0){
        //         number = nums[i];
        //     }
        //     if(nums[i] == number){
        //         count++;
        //     } else {
        //         count--;
        //     }
        // }
        // return number;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            } else {
                mp.put(nums[i], mp.get(nums[i]) +1);
            }
            if(mp.get(nums[i]) > n/2) return nums[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println("The majority element is : " + majorityElement(arr));
    }
}
