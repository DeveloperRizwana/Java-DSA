import java.util.*;

public class searchIn2dArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 13, 4, 6 },
                { 78, 98, 9, 15, 6 }
        };
        int target = 20;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };

    }
}
