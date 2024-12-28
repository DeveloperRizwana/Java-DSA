public class removeConsecutiveDuplicates {
    static String removeDuplicates(String str){
        if(str.length() == 0) return str;
        String ans = "" + str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabbssccd";
        System.out.println("Removed duplicates: " + removeDuplicates(str));
    }
    
}
