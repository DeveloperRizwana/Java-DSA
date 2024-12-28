public class palindrome {
    static boolean isPlaindrome(String s, int l, int r){
        if(l >= r) return true;

        return (s.charAt(l) == s.charAt(r) && isPlaindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        String s = "rizu";
        System.out.println(isPlaindrome(s, 0, s.length() - 1));
    }
    
}
// static boolean isPalindrome(String str){
//     if(str.length() == 0 || str.length() == 1) return true;

//     char curChar = str.charAt(0);
//     char laString = str.charAt(str.length()-1);
//     if(curChar == laString){
//         return isPalindrome(str.substring(1, str.length()-1));

//     }else {
//         return false;
//     }
// }
// public static void main(String[] args) {
//     System.out.println("Palindrome: ");
//     String str = "asba";
//     System.out.println(isPalindrome(str));

// }


