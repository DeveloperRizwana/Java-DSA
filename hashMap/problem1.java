import java.util.HashMap;

public class problem1 {
    static void HashMapMethod() {
        // Map<String,Integer> mp = new HashMap<>();
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Rizwana", 21);
        mp.put("Nusrat", 28);
        mp.put("Jasmine", 25);

        System.out.println(mp.get("Rizwana"));
        System.out.println(mp.get("Razia"));

        // changing/updating value of a key in the HashMap
        mp.put("Nusrat", 26);
        System.out.println(mp.get("Nusrat"));

        // Remvoing a pair from the HashMap
        System.out.println(mp.remove("Jasmine"));
        System.out.println(mp.get("Jasmine"));

        // Cheking If a key is in the HashMap
        System.out.println(mp.containsKey("Rizwana")); // True or False

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Jasmine", 18); // will not enter

        // Get all keys in the HashMap
        System.out.println(mp.keySet());

        // Get all in the HashMap
        System.out.println(mp.values());

        // Get all the entries in the HAshMap
        System.out.println(mp.entrySet());
        System.out.println();
        // Traversing all entries of HashMap - multiole methods
        for (String key : mp.keySet()) {
            System.out.printf(" Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for (var e : mp.entrySet()) {
            System.out.printf(" Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethod();
    }
}
// create a hashmap using java Hashmap class to store the following
// pairs(person,age) and display them