import java.util.Scanner;
public class uniqueElement {
    static int findUniqueElement(int[] nums) {
        // approach-1
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

        // // approach-2
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             nums[i] = -1;
        //             nums[j] = -1;
        //         }
        //     }
        // }
        // int ans = -1;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > 0) {
        //         ans = nums[i];
        //     }
        // }
        // return ans;

        //approach-3
        // int n = nums.length;
        // int[] result = new int[n];
        // for(int i = 0; i < n; i++){
        //     int count = 0; 
        //     for(int j =0 ; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     result[i] = count;
        // }
        // for(int i = 0; i < n; i++){
        //     if(result[i] == 1){
        //         return nums[i];
        //     }
        // }
        // return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique element: " + findUniqueElement(arr));

    }
}
// find the unique number in a given array where all the elements are being
// repeated twice with one value being unique
