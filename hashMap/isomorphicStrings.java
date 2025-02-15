import java.util.HashMap;

public class isomorphicStrings {
    public static boolean isIsomorphicStrings(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if (mp.containsKey(sCh)) {
                if (mp.get(sCh) != tCh)
                    return false;
            } else if (mp.containsValue(tCh)) {
                return false;
            } else {
                mp.put(sCh, tCh);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        // System.out.println(isIsomorphicStrings(s, t));
        if(isIsomorphicStrings(s, t)){
            System.out.println(s + " and " + t + " are an Isomorphic Strings");
        } else {
            System.out.println(s + " and " + t + " are not an Isomorphic Strings");
        }

    }

}
