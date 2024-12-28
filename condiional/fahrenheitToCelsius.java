import java.util.*;
public class fahrenheitToCelsius {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int s = 0;
		int e = 100;
		int w = 20;

		for(int i = s; i <= e; i = i + w){
			int fh = (((i - 32)*5)/9);
			// System.out.println(i + " " + ((i - 32)*5)/9);
			System.out.println(i + " " + fh);
		}
	}

}
