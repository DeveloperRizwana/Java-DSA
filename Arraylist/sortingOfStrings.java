import java.util.ArrayList;
import java.util.Collections;

public class sortingOfStrings {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(1);
        list.add(12);
        list.add(21);
        list.add(10);

        System.out.println("Original list " + list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Des order " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original list " + l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorted list " + l1);

    }
    
}
