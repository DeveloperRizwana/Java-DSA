public class longestSubarray {
    public static int lenOfLongestSubarr(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        System.out.println(lenOfLongestSubarr(arr, 15));
    }
}
