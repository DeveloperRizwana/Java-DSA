import java.util.HashMap;
// import java.util.stream.Gatherer.Integrator;

public class Anagram {
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;
    }

    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;
    // HashMap<Character, Integer> mp1 = makeFreqMap(s);
    // HashMap<Character, Integer> mp2 = makeFreqMap(t);
    // return mp1.equals(mp2);
    // }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for(int i = 0; i < t.length(); i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            
            int currFreq = mp.get(ch);
            if (currFreq == 1) {
                mp.remove(ch); // Corrected: Remove the character when freq becomes 0
            } else {
                mp.put(ch, currFreq - 1);
            }
        }
        return mp.isEmpty(); // If map is empty, it's an anagram
    }

    public static void main(String[] args) {
        String s = "aacc";
        String s1 = "ccac";
        // System.out.println(isAnagram(s, s1));
        if (isAnagram(s, s1)) {
            System.out.println(s + " and " + s1 + " are anagram..");
        } else {
            System.out.println(s + " and " + s1 + " are not anagram..");
        }
    }
}
