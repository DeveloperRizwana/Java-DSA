public class fifthPractcie {
  public static int findMaxConsecutiveOnes(int[] nums) {
    int ones = 0;
    int maxConsecutive = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        ones++;
        maxConsecutive = Math.max(maxConsecutive, ones);
      } else {
        ones = 0;

      }
    }
    return maxConsecutive;
  }

  public static void main(String[] args) {
    int[] a = {1,0,1,1,0,1 };
    System.out.println(findMaxConsecutiveOnes(a));
  }
}
