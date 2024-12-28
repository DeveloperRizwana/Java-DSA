package Functions;

import java.util.*;

public class eligibleToVote {
    public static boolean printEligibleToVote(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        boolean isEligibleToVote = printEligibleToVote(age);
        System.out.println("The person is eligible to vote is : " + isEligibleToVote);

    }

}
// Write a function that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 is eligible to vote.
