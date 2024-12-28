import java.util.*;
public class pushZerosAtEnd {
    static void findZerosAtEnd(int[] arr){
        
        // int i = 0, j = arr.length - 1; 
        // while(i <= j){
        //     if(arr[i] == 0 && arr[j] != 0){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i++;
        //         j--;
        //     }
        //     if(arr[i] != 0){
        //         i++;
        //     }
        //     if(arr[j] == 0){
        //         j--;
        //     }
        // }
        int t = 0;    // optimized code
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;
                t++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        findZerosAtEnd(arr);
        

    }
    
}
