public class fifthPractcie {
  static boolean searchInSorted(int arr[], int k) {
    for(int i = 0; i <= arr.length-1; i++){
      if(arr[i] == k){
        return true;
      } 
    }
    return false;
  }
  public static void main(String[] args) {
    int[] a = {2, 3, 5, 6};
    System.out.println(searchInSorted(a, 1));
  }
}
