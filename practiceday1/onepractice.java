
public class onepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int pr = 1;
        for (int i = 1; i <= n; i++) {
            pr *= x;// product = product * x;
        }
        System.out.println(" x to the power n is : " + pr);
    }

}
