public class findMajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, number = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(count == 0){
                number = nums[i];
            }
            if(nums[i] == number){
                count++;
 
            } else {
                count--;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,4,2,4};
        System.out.println("The majority element is : " + majorityElement(arr));
    }
}
