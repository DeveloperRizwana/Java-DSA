import java.util.*;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,5,6,7};
        swap(arr, 0,2,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index, int index2, int index1,int index3){
        int temp = arr[index];
        arr[index] = arr [index2];
        arr[index2] = temp;

        int temp1 = arr[index1];
        arr[index1] = arr [index3];
        arr[index3] = temp1;
    }    
}


