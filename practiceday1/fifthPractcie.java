public class fifthPractcie {
  public static int removeOccurances(int[] a){
    int n = a.length;
    int idx = a[0];
    int x = 1;
    for(int i = 1; i < n; i++){
      if(idx != a[i]){
        idx = a[i];
        a[x++] = a[i];
      }
    }
    return x;
  }
  public static void main(String[] args) {
    int[] a = {0,0,1,1,1,2,2,3,3} ;
    int result = removeOccurances(a);
    System.out.println(result);

    for(int i = 0; i < result; i++){
      System.out.print(a[i] + " ");
    }
  }
}
