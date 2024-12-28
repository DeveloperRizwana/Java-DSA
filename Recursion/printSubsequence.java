public class printSubsequence {
    static void printSSQ(String s, String curAns){
        if(s.length() == 0){
            System.out.println(curAns);
            return;
        }
        // recursive wrok
        char curChar = s.charAt(0);
        String smallAns = s.substring(1);

        //self work -> add curChar
        printSSQ(smallAns, curAns + curChar);
        //don't add curChar
        printSSQ(smallAns, curAns);
    }
    public static void main(String[] args) {
        System.out.println("Subsequence: ");
        printSSQ("abc", "");
    }
    
}
