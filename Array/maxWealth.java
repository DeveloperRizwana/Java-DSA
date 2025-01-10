import java.util.*;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 12, 345, 2 },
                { 6, 7896 },
                { 10, 20, 30 }
        };

        maxWealth mainObj = new maxWealth(); // Create an instance of Main
        System.out.println(mainObj.maximumWealth(accounts)); // Call the method

    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
