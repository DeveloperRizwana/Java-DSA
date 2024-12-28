import java.util.*;
public class sorted012 { 
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int k, int m){
        int temp = arr[k];
        arr[k] = arr[m];
        arr[m] = temp;
    }
    static void findsorted012(int[] arr){
        int Pz = 0;
        int Pt = arr.length - 1;
        int i = 0;
        while(i <= Pt){
            if(arr[i] == 0){
                swap(arr, i, Pz);
                Pz++;
                i++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 2){
               swap(arr, i, Pt);
               Pt--;
            }
        }
   
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);

        findsorted012(arr);

        System.out.println("Sorted 0 1 2: ");
        printArray(arr);
    }
    
}

    

