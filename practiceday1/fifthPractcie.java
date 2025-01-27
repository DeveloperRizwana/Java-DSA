public class fifthPractcie {
  public static boolean isPalindrome(String s) {
    if(s.length() == 0) return true;
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    int st = 0, end = s.length()-1;
    while(st < end){
      if(s.charAt(st) != s.charAt(end)){
        return false;
      }
      st++;
      end--;
    }
    return true;
        
  }
  public static void main(String[] args) {
    String s = "race a car";
    System.out.println(isPalindrome(s));
  }
}
