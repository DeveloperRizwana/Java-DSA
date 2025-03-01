import java.util.Arrays;

public class longestConsecutive {
    public static int findLongestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int n = nums.length, length = 1, maxLength = 1;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                length++;
                maxLength = Math.max(maxLength, length);
            } else if (nums[i] != nums[i + 1]) {
                length = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] a = { 1, 0, 1, 2 };
        System.out.println(findLongestConsecutive(a));
    }
}
