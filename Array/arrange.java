import java.util.*;
public class arrange {
    
    static void findArrangedArray(int[] arr, int n){
        int i = 0, j = n - 1; 
        int num = 1;
        while (i <= j) {
            if (num % 2 == 1) { // Add odd numbers from the left
                arr[i++] = num;
            } else { // Add even numbers from the right
                arr[j--] = num;
            }
            num++;
            
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
    
    findArrangedArray(arr,n);
    }
}
