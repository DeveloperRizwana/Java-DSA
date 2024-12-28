public class reverseString {
    static String reverse1(String s){
        // base case
        if(s.length() == 0) return "";
        //recursive work
         String smallAns = reverse1(s.substring(1));
        //self work
        return smallAns + s.charAt(0);
    }
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";

        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        System.out.println("Reversed String: ");
        String s = "Hello";
        System.out.println(reverse(s, 0));
        System.out.println(reverse1(s));
    }
    
}
