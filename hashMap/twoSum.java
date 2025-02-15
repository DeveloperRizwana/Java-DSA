public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // int[] result = new int[2];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    // result[0] = i;
                    // result[1] = j;
                    return new int[]{i,j};
                }
            }
        }
        return  new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] a = {3,2,4};
        int[] result = twoSum(a, 6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
