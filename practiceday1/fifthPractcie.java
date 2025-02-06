import java.util.ArrayList;

public class fifthPractcie {
  public static ArrayList<Integer> findUnion(int a[], int b[]) {
    int n = a.length, m = b.length;
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while(i<n && j<m){
      if(a[i] <= b[j]){
        if(result.size() == 0 || result.get(result.size() - 1)  != a[i]){
          result.add(a[i]);
        }
        i++;
      } else {
        if(result.size() == 0 || result.get(result.size() - 1) != b[j]){
          result.add(b[j]);
        }
        j++;
      } 
    }
    while(i<n){
      if(result.size() == 0 || result.get(result.size() - 1) != a[i]){
        result.add(a[i]);
      }
      i++;
    }
    while (j<m) {
      if(result.size() == 0 || result.get(result.size() - 1)  != b[j]){
        result.add(b[j]);
      }
      j++;
    }
    return result;
    }
  public static void main(String[] args) {
    int[] a = {1,1,1,1,1};
    int[] b = {2,2,2,2,2};
    ArrayList<Integer> result = findUnion(a, b);
    System.out.println(result);
  }
}
