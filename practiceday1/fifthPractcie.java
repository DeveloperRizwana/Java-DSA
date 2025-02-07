public class fifthPractcie {
  public static int missingNumber(int[] nums) {
    int missingNum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == missingNum) {
        missingNum++;
        i = -1;
      }
    }
    return missingNum;
  }

  public static void main(String[] args) {
    int[] a = { 9,6,4,2,3,5,7,0,1};
    System.out.println(missingNumber(a));
  }
}
