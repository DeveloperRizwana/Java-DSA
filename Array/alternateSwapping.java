import java.util.Arrays;

public class alternateSwapping {
    static void swap(int[] a){
        int n = a.length;
        // int st = a[0], alt = a[2];
        int i = 0;
        while (i < n) {
            int temp = a[i];
            a[i] = a[i+2];
            a[i+2] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        swap(a);
        System.out.println(Arrays.toString(a));
    }
    
}
