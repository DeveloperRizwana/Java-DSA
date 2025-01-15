import java.util.ArrayList;
import java.util.Collections;
public class leaders {
     static ArrayList<Integer> findLeaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxLeaders = -1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] >= maxLeaders){
                result.add(arr[i]);
                maxLeaders = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] a = {30, 10, 10, 5};
        ArrayList<Integer> result = findLeaders(a);
        System.out.println(result);
    }
}
