public class fifthPractcie {
  static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void reverseArray(int arr[]) {
    int n = arr.length, st = 0, end = n-1;
    while (st<end) {
      swap(arr,st,end);
      st++;
      end--;
    }
  }
  public static void main(String[] args) {
      int[] a = {4, 5, 2};
      reverseArray(a);
      for(int i = 0; i<a.length; i++){
        System.out.print(a[i] + " ");
      }
  }
}
