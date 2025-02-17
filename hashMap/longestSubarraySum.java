import java.util.HashMap;

public class longestSubarraySum {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            if (prefSum == k)
                maxLen = i + 1;

            if (mp.containsKey(prefSum - k)) {
                maxLen = Math.max(maxLen, (i - mp.get(prefSum - k)));
            }
            mp.putIfAbsent(prefSum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { -5, 8, -14, 2, 4, 12, };
        System.out.println("The length of the longest subarray : " + longestSubarray(arr, -5));
    }
}
