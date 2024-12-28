import java.util.*;
public class sumOftwoArrays {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void findSumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int n = arr1.length - 1;
        int m = arr2.length - 1;
        int carry = 0;
        int k = output.length - 1;

        while(n >= 0 || m >= 0 || carry > 0){
            int sum = carry;
            if(n >= 0){
                sum += arr1[n];
                n--;
            }
            if(m >= 0){
                sum += arr2[m];
                m--;
            }
            output[k] = sum % 10;
            carry = sum / 10;
            k--;
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st Array: ");
        int n = sc.nextInt();
        System.out.println("Enter size of 2nd Array: ");
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] output = new int[Math.max(n, m) + 1];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr1.length; i++){
                arr1[i] = sc.nextInt();
            
        }
        System.out.println("Enter " + m + " elements");
        for(int j = 0; j < arr2.length; j++){
            arr2[j] = sc.nextInt();
        }   
        findSumOfTwoArrays(arr1, arr2, output); 
        System.out.println("Sum of the two array: ");
        printArray(output);

    }
    
}
