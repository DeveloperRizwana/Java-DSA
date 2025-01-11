public class PairWithMaxSum {
    public static int pairWithMaxSum(int arr[]) {
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            // int min = Integer.MAX_VALUE;
            // int secondmin = Integer.MAX_VALUE;
            // for (int j = i; j < arr.length; j++) {
            // if (arr[j] < min) {
            // secondmin = min;
            // min = arr[j];
            // } else if (arr[j] > min && arr[j] < secondmin) {
            // secondmin = arr[j];
            // }
            // if (maxScore != Integer.MAX_VALUE) {
            // int minScore = min + secondmin;
            // maxScore = Math.max(maxScore, minScore);
            // }
            // }
            maxScore = Math.max(maxScore, arr[i] + arr[i + 1]);
        }
        return maxScore;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 6 };
        System.out.println("Maximum Score from Adjacent Pair Sums: " + pairWithMaxSum(arr));
    }

}
