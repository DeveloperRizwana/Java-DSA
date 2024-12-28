public class removeConsecutiveDuplicate {
    static String removeDuplicate(String s){
        if(s.length() == 0) return s;
        if(s.length() == 1) return s;

        char smallAns = s.charAt(0);
        char bigAns = s.charAt(1);
        if(smallAns ==  bigAns){
            return removeDuplicate(s.substring(1));
        } else {
            return smallAns + removeDuplicate(s.substring(1));
        }
    }
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println("Removed consecutive duplicate: " + removeDuplicate(s));
    }
    
}
