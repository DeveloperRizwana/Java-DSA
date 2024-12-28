
import java.util.*;

public class evenDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };

		System.out.println(findNums(nums));
	}

	static int findNums(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;

	}

	static boolean even(int num) {
		int numberOfDigit = digits(num);
		return numberOfDigit % 2 == 0;
	}

	static int digits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
