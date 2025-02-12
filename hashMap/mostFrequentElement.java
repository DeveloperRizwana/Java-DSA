import java.util.HashMap;

public class mostFrequentElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 1, 2, 2, 2 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int e : arr) {
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                freq.put(e, freq.get(e) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int maxFreq = -1, ansKey = -1;
        // for (var e : freq.entrySet()) {
        //     if (e.getValue() > maxFreq) {
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }

        for(var key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        // System.out.println(maxFre);
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
    }
}

// given an array, find the most frequent element in it. If there are multiple
// elements that appear a maximum number of times, print any one of them
