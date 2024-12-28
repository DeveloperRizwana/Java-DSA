import java.util.ArrayList;

public class returnSubsequences {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        // recursive work
        char curChar = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        // self work
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curChar + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Subsequence: ");
        ArrayList<String> ans = getSSQ("abc");
        for (String ss : ans) {
            System.out.println(ss);
            
        }
    }
    
}
