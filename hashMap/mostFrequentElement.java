import java.util.HashMap;

public class mostFrequentElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 1, 2, 2, 2 };
        HashMap<Integer, Integer> fre = new HashMap<>();
        for (int e : arr) {
            if (!fre.containsKey(e)) {
                fre.put(e, 1);
            } else {
                fre.put(e, fre.get(e) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(fre.entrySet());

        int maxFre = -1, ansKey = -1;
        for (var e : fre.entrySet()) {
            if (e.getValue() > maxFre) {
                maxFre = e.getValue();
                ansKey = e.getKey();
            }
        }
        // System.out.println(maxFre);
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFre);
    }
}

// given an array, find the most frequent element in it. If there are multiple
// elements that appear a maximum number of times, print any one of them
