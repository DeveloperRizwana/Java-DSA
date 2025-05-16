import java.util.ArrayList;

public class fifthPractcie {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static ArrayList<Integer> findUnion(int a[], int b[]) {
    // add your code here
    int n = a.length, m = b.length, i = 0, j = 0, k = 0;
    ArrayList<Integer> result = new ArrayList<>();
    while (i < n && j < m) {
      if (a[i] <= b[j]) {
        if (result.size() == 0 || result.get(result.size() - 1) != a[i]) {
          result.add(a[i]);
        }
        i++;
      } else {
        if (result.size() == 0 || result.get(result.size() - 1) != b[j]) {
          result.add(b[j]);
        }
        j++;
      }
    }
    while (i < n) {
        if (result.size() == 0 || result.get(result.size() - 1) != a[i]) {
          result.add(a[i]);
        }
        i++;
    }
    while (j < m) {
        if (result.size() == 0 || result.get(result.size() - 1) != b[j]) {
          result.add(b[j]);
        }
        j++;
    }
    return result;
  }

  public static void swap(int[] arr, int st, int end) {
    int temp = arr[st];
    arr[st] = arr[end];
    arr[end] = temp;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = { 1, 2, 3, 6, 7 };
    ArrayList<Integer> result = findUnion(a, b);
    System.out.println(result);
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i] + " ");
    // }
  }
}
