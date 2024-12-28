public class palindromicSubstring {
    static boolean isPalindrome(String s){
        if(s.length() == 0) return true;
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abbd";
        System.out.println("Result: ");
        int count = 0;
        for(int i = 0; i <= s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                if(isPalindrome(s.substring(i, j)) == true){
                    System.out.print(s.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\n The number of palindromic substrings are: " + count);
    }
    
}
