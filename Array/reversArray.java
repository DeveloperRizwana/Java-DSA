import java.util.Arrays;

public class reversArray {
    public  void reverseArray(int arr[]) {
        int st = 0, end = arr.length-1;
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            end--;
            st++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reversArray reverse = new reversArray();
        reverse.reverseArray(arr);
        // System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
