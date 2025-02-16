import java.util.HashMap;

public class longestSubarraySum {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0, prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            // if(prefSum == k){
            // maxLen = i+1;
            // }

            if (mp.containsKey(prefSum - k)) {
                maxLen = Math.max(maxLen, (i - mp.get(prefSum - k)));
            } else {
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10 };
        System.out.println(longestSubarray(arr, 15));
    }
}
