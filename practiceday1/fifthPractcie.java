import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class fifthPractcie {
  static ArrayList<Integer> leaders(int arr[]) {
    int n = arr.length, leaders = arr[n - 1];
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] >= leaders) {
        leaders = arr[i];
        result.add(arr[i]);
      }
    }
    Collections.reverse(result);
    return result;
  }

  public static void main(String[] args) {
    int[] a = { 5, 10, 20, 40 };
    ArrayList<Integer> result = leaders(a);
    System.out.println(result);
  }
}
