public class halfDiamond {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("*");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i - j);
            }
            System.out.println("*");

        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i - j);
            }
            System.out.println("*");

        }
        System.out.print("*"); // END POINT
    }
}
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
