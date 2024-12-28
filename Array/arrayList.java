package Array;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(11);
        // list.add(10);
        // list.add(34);
        // list.add(15);

        // // System.err.println(list.contains(20));
        // System.out.println(list);
        // list.set(0, 99);

        // list.remove(2);
        // System.out.println(list);
        for (int i = 0; i < 5; i++) { // input
            list.add(sc.nextInt());
        }
        // System.out.println(list);
        for (int i = 0; i < 5; i++) { // get item at any index
            System.out.println(list.get(i));
        }

    }

}
