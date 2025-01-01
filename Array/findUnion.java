import java.util.ArrayList;
public class findUnion {
    public static ArrayList<Integer> union(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
       int i = 0, j = 0;
       int n1 = a.length, n2 = b.length;
       while(i<n1 && j<n2){
        if(a[i] <= b[j]){
            if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                result.add(a[i]);
            }
            i++;
        } else{
            if(result.isEmpty() || result.get(result.size()-1) != b[j]){
                result.add(b[j]);
            }
            j++;
        } 
       }
       while (i<n1) {

        if(result.isEmpty() || result.get(result.size()-1) != a[i]){
            result.add(a[i]);
        }
        i++;
    }
       while (j<n2) {

        if(result.isEmpty() || result.get(result.size()-1) != b[j]){
          result.add(b[j]);
      }
      j++;
    }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        ArrayList<Integer> result = union(a, b);
        System.out.println(result);
    }
    
}
