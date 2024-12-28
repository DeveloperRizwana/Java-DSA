import java.util.*;
public class arrayrotateCheck {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   
    static int findArrayRotateCheck(int[] arr){
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {  // Find the smallest element
                return i + 1;
            }
        }
        return k;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        int ans = findArrayRotateCheck(arr);
        System.out.println("Returned value of K " + ans);
    }
    
}
