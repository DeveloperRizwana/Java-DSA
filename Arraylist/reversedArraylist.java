import java.util.ArrayList;
// import java.util.Collections;

public class reversedArraylist {
    static void findreversedArraylist(ArrayList<Integer> list){
        Integer i = 0, j = list.size() - 1;
        while(i <= j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
            
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(01);
        list.add(02);
        list.add(30);
        list.add(40);

        System.out.println("Original list " + list);
        findreversedArraylist(list);
        // Collections.reverse(list);
        System.out.println("Reversed List " + list);
    }
    
}
