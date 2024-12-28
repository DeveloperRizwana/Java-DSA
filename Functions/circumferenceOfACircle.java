package Functions;

import java.util.*;

public class circumferenceOfACircle {
    public static double findCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();

        double result = findCircumference(radius);
        System.out.println("The circumference of a circle is : " + result);

    }

}
// Write a function that takes in the radius as input and returns the
// circumference of a circle.
