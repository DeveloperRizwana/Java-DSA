public class fifthPractcie {
  public static int singleNumber(int[] nums) {
    if(nums.length == 1 && nums[0] == -1) return -1;
    int n = nums.length;
    int singleNum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if (nums[i] == nums[j]) {
          nums[i] = 0;
          nums[j]= 0;
        }
      }
      if (nums[i] != 0) {
        singleNum = nums[i];
      }
    }
    return singleNum;
  }

  public static void main(String[] args) {
    int[] a = { 1};
    System.out.println(singleNumber(a));
  }
}
