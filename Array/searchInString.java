import java.util.*;

public class searchInString {

    public static void main(String[] args) {
        String name = "rizu";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));

        boolean found = search(name, target);
        System.out.println("Character '" + target + "' found: " + found);

    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
