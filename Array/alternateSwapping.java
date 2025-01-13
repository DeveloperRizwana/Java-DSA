import java.util.Arrays;
public class alternateSwapping {
    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void reverse(int[] a, int st, int end){
        while (st < end) {
            swap(a, st, end);
            st++;
            end--;
        }
    }
    static void permutaion(int[] a){
        int n = a.length;
        int gola_idx = 0;
        for(int i = n-1; i > 0; i--){
            if(a[i] > a[i-1]){
                gola_idx = i-1;
                break;
            }
        }
        if(gola_idx == 0){
            reverse(a, 0, n-1);
            return;
        }
        for(int j = n-1; j > gola_idx+1; j--){
            if(a[j] > a[gola_idx]){
                swap(a, gola_idx, j);
                break;
            }
        }
        reverse(a, gola_idx, n-1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        printArray(a);
        permutaion(a);
        printArray(a);
    }
    
}
