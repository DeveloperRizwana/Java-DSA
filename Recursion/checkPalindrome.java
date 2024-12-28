public class checkPalindrome {
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";

        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);

    }
    public static void main(String[] args) {
        String s = "dad";
        String rev = reverse(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is palindrome",s);
        } else {
            System.out.printf("%s is not palindrome",s);
        }
    }
    
}
