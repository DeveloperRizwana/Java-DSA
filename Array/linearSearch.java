import java.util.*;

public class linearSearch {

    public static void main(String[] args) {
        // search in the array : return the index if item ClassNotFoundException
        // otherwise if item not found return -1
        int[] arr = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}

// int[] arr = {12,34,56,78,9};
// int x = 9;
// int ans = -1;
// for(int i = 0; i < arr.length; i++){
// if(arr[i] == x){
// ans = i;
// }
// }
// System.out.println(ans);

// }
// }
