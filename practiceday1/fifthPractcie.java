public class fifthPractcie {
    static int countDig(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int n) {
        int originalN = n;
        int numberOFDig = countDig(originalN);
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            n = n / 10;
            double pow = Math.pow(lastDig, numberOFDig);
            sum += pow;
        }
        if (originalN == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 1234;
        System.out.println("Answer is : " + isArmstrong(a));
        System.out.println(countDig(a));
    }
}
