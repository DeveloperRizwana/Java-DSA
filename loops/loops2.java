import java.util.*;

public class loops2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0; // aisa value lena hai jo koi effect na dale output pe,, (let say 0(sum) + 1 =
                 // 1)
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum);

  }

}
// sum till n