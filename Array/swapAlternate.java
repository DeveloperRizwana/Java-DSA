import java.util.*;
public class swapAlternate {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
    }
    static void findswapAlternate(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter size of an Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
     
       
        System.out.println("Original Array");
        printArray(arr);
        findswapAlternate(arr);
        System.out.println("swaped alternate array");
        printArray(arr);
      
    }
    
}
