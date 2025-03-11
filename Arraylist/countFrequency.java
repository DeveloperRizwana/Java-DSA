import java.util.ArrayList;
import java.util.List;

public class countFrequency {
     public static List<Integer> frequencyCount(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3 };
        System.out.println("Count of the frequncy of all numbers from 1 to N : " + frequencyCount(arr));
    }
}
