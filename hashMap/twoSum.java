import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // // int[] result = new int[2];
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // sum = nums[i] + nums[j];
        // if (sum == target) {
        // // result[0] = i;
        // // result[1] = j;
        // return new int[]{i,j};
        // }
        // }
        // }
        // // return result;
        // return new int[]{-1,-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];
            if (mp.containsKey(partner)) {
                return new int[] { mp.get(partner), i };
            }
            mp.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] a = { 14,7,10,4,5,1,2,9};
        int[] result = twoSum(a, 13);
        // System.out.println(result[1]);
        // System.out.println(result[0]);
        System.out.println("Indices : " + result[0] + "," + result[1]);

    }

}
