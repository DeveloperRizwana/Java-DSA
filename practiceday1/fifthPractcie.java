public class fifthPractcie {
  public static void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    reverse(nums, 0, n-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);
  }
  public static void reverse(int[] nums, int i, int j){
    while (i<j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
      j--;
    }
  }
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7};
    rotate(a, 3);
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
  }
}
