public class palindrome1 {
    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return true;

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int st = 0, end = s.length()-1;
        while (st<end) {
            if(s.charAt(st) != s.charAt(end)){
                return false;
            } 
            st++;
            end--;
        }
        return true;
    }
        public static void main(String[] args) {
        // String s = "abcdcgba";
        // int i = 0, j = s.length()-1;
        // boolean flag = true;
        // while (i<j) {
        //     if(s.charAt(i) != s.charAt(j)){
        //         flag = false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // if(flag == true) System.out.println("Palindrome");
        // else System.out.println("Not Palindrome");

        String s = "A man, a plan, a canal: Panama";

        // System.out.println(s.toLowerCase());
        System.out.println("Result : " + isPalindrome(s));
    }
    
}
