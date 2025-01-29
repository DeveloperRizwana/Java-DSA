public class fifthPractcie {
  public static int largest(int arr[]) {
    int max = -1;
    int secondMax = -1;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        secondMax = max;
        max = arr[i];
      } else if(arr[i] > secondMax && arr[i] < max){
        secondMax = arr[i];
      }
    }
    return secondMax;
  }
  public static void main(String[] args) {
    int[] a = {10,5,10} ;
    System.out.println(largest(a));
  }
}
